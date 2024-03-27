package run.freshr.common.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 데이터 모델
 *
 * @author FreshR
 * @apiNote 데이터 모델
 * @since 2024. 3. 26. 오후 5:01:47
 */
@Data
@Builder
public class ExceptionData {

  /**
   * Http Status
   *
   * @apiNote Http Status
   * @since 2024. 3. 26. 오후 5:01:47
   */
  private HttpStatus httpStatus;
  /**
   * 메시지
   *
   * @apiNote 메시지
   * @since 2024. 3. 26. 오후 5:01:47
   */
  private String message;
  /**
   * 에러 코드
   *
   * @apiNote 에러 코드
   * @since 2024. 3. 26. 오후 5:01:47
   */
  private String code;

}
