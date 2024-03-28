package run.freshr.common.configurations;

import static java.util.Objects.isNull;
import static java.util.Optional.ofNullable;
import static run.freshr.common.enumerations.StatusEnum.ACCESS_DENIED;
import static run.freshr.common.enumerations.StatusEnum.BATCH_UPDATE;
import static run.freshr.common.enumerations.StatusEnum.CONSTRAINT_VIOLATION;
import static run.freshr.common.enumerations.StatusEnum.DATA;
import static run.freshr.common.enumerations.StatusEnum.DATA_INTEGRITY_VIOLATION;
import static run.freshr.common.enumerations.StatusEnum.DUPLICATE;
import static run.freshr.common.enumerations.StatusEnum.ENTITY_NOT_FOUND;
import static run.freshr.common.enumerations.StatusEnum.ERROR;
import static run.freshr.common.enumerations.StatusEnum.EXPIRED_JWT;
import static run.freshr.common.enumerations.StatusEnum.FILE_SIZE_LIMIT_EXCEEDED;
import static run.freshr.common.enumerations.StatusEnum.ILLEGAL_ARGUMENT;
import static run.freshr.common.enumerations.StatusEnum.ILLEGAL_STATE;
import static run.freshr.common.enumerations.StatusEnum.INVALID_DATA_ACCESS_RESOURCE_USAGE;
import static run.freshr.common.enumerations.StatusEnum.IO;
import static run.freshr.common.enumerations.StatusEnum.JSON_PROCESSING;
import static run.freshr.common.enumerations.StatusEnum.JWT;
import static run.freshr.common.enumerations.StatusEnum.NULL_POINTER;
import static run.freshr.common.enumerations.StatusEnum.PARAMETER;
import static run.freshr.common.enumerations.StatusEnum.SQL_GRAMMAR;
import static run.freshr.common.enumerations.StatusEnum.SQL_SYNTAX_ERROR;
import static run.freshr.common.enumerations.StatusEnum.SUCCESS;
import static run.freshr.common.enumerations.StatusEnum.UN_AUTHENTICATED;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import run.freshr.common.data.ExceptionData;
import run.freshr.common.data.ExceptionsData;
import run.freshr.common.enumerations.StatusEnum;
import run.freshr.common.properties.ExceptionsProperties;

/**
 * 예외 설정
 *
 * @author FreshR
 * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
 *          기본 설정 값으로 예외 데이터 객체 설정
 * @since 2024. 3. 26. 오후 5:12:17
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(ExceptionsProperties.class)
public class ExceptionsAutoConfiguration {

  /**
   * 예외 데이터 객체 설정
   *
   * @param properties application.properties 와 application.yml 에서 설정한 값
   * @return 예외 데이터 객체
   * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
   *          기본 설정 값으로 예외 데이터 객체 설정
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:12:17
   */
  @Bean
  @ConditionalOnMissingBean
  public ExceptionsData exceptionsData(ExceptionsProperties properties) {
    return ExceptionsData
        .builder()
        .success(setExceptions(properties.getSuccess(), SUCCESS))
        .parameter(setExceptions(properties.getParameter(), PARAMETER))
        .duplicate(setExceptions(properties.getDuplicate(), DUPLICATE))
        .unAuthenticated(setExceptions(properties.getUnAuthenticated(), UN_AUTHENTICATED))
        .nullPointer(setExceptions(properties.getNullPointer(), NULL_POINTER))
        .entityNotFound(setExceptions(properties.getEntityNotFound(), ENTITY_NOT_FOUND))
        .io(setExceptions(properties.getIo(), IO))
        .fileSizeLimitExceeded(setExceptions(
            properties.getFileSizeLimitExceeded(), FILE_SIZE_LIMIT_EXCEEDED))
        .json(setExceptions(properties.getJson(), JSON_PROCESSING))
        .jsonProcessing(setExceptions(properties.getJsonProcessing(), JSON_PROCESSING))
        .sqlSyntaxError(setExceptions(properties.getSqlSyntaxError(), SQL_SYNTAX_ERROR))
        .invalidDataAccessResourceUsage(setExceptions(
            properties.getInvalidDataAccessResourceUsage(), INVALID_DATA_ACCESS_RESOURCE_USAGE))
        .dataIntegrityViolation(setExceptions(
            properties.getDataIntegrityViolation(), DATA_INTEGRITY_VIOLATION))
        .batchUpdate(setExceptions(properties.getBatchUpdate(), BATCH_UPDATE))
        .sqlGrammar(setExceptions(properties.getSqlGrammar(), SQL_GRAMMAR))
        .constraintViolation(setExceptions(
            properties.getConstraintViolation(), CONSTRAINT_VIOLATION))
        .data(setExceptions(properties.getData(), DATA))
        .accessDenied(setExceptions(properties.getAccessDenied(), ACCESS_DENIED))
        .illegalState(setExceptions(properties.getIllegalState(), ILLEGAL_STATE))
        .illegalArgument(setExceptions(properties.getIllegalArgument(), ILLEGAL_ARGUMENT))
        .jwt(setExceptions(properties.getJwt(), JWT))
        .expiredJwt(setExceptions(properties.getExpiredJwt(), EXPIRED_JWT))
        .error(setExceptions(properties.getError(), ERROR))
        .build();
  }

  /**
   * 예외 데이터 설정
   *
   * @param data        data
   * @param enumeration enumeration
   * @return the exceptions
   * @apiNote api note
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:12:17
   */
  private ExceptionData setExceptions(ExceptionData data, StatusEnum enumeration) {
    if (isNull(data)) {
      return ExceptionData
          .builder()
          .httpStatus(enumeration.getStatus())
          .message(enumeration.getMessage())
          .code(enumeration.getCode())
          .build();
    }

    return ExceptionData
        .builder()
        .httpStatus(ofNullable(data.getHttpStatus()).orElse(enumeration.getStatus()))
        .message(ofNullable(data.getMessage()).orElse(enumeration.getMessage()))
        .code(ofNullable(data.getCode()).orElse(enumeration.getCode()))
        .build();
  }

}
