package run.freshr.common.serializer;

import static com.google.common.base.CaseFormat.LOWER_HYPHEN;
import static com.google.common.base.CaseFormat.UPPER_UNDERSCORE;
import static run.freshr.common.enumerations.StatusEnum.PARAMETER;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.validation.Errors;
import run.freshr.common.enumerations.StatusEnum;

/**
 * 에러 Json 변환
 *
 * @author FreshR
 * @apiNote 에러 Json 변환
 * @since 2024. 3. 26. 오후 5:12:17
 */
@Slf4j
@JsonComponent
public class ErrorsSerializer extends JsonSerializer<Errors> {

  /**
   * 에러 변환 로직
   *
   * @param errors             에러
   * @param generator          JSON 제너레이터
   * @param serializerProvider 변환 프로바이더
   * @throws IOException the io exception
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:12:17
   */
  @Override
  public void serialize(Errors errors, JsonGenerator generator,
      SerializerProvider serializerProvider) throws IOException {
    generator.writeStartObject();

    StatusEnum parameter = PARAMETER;

    generator.writeStringField("name",
        UPPER_UNDERSCORE.to(LOWER_HYPHEN, parameter.getKey()));
    generator.writeStringField("code", parameter.getCode());
    generator.writeStringField("message", "Parameter Exception");

    generator.writeArrayFieldStart("list");

    errors.getFieldErrors().forEach(e -> {
      try {
        generator.writeStartObject();
        generator.writeStringField("field", e.getField());
        generator.writeStringField("objectName", e.getObjectName());
        generator.writeStringField("code", e.getCode());
        generator.writeStringField("defaultMessage", e.getDefaultMessage());
        generator.writeEndObject();
      } catch (IOException ex) {
        log.error(ex.getMessage(), ex);
      }
    });

    errors.getGlobalErrors().forEach(e -> {
      try {
        generator.writeStartObject();
        generator.writeStringField("objectName", e.getObjectName());
        generator.writeStringField("code", e.getCode());
        generator.writeStringField("defaultMessage", e.getDefaultMessage());
        generator.writeEndObject();
      } catch (IOException ex) {
        log.error(ex.getMessage(), ex);
      }
    });

    generator.writeEndArray();
  }

}
