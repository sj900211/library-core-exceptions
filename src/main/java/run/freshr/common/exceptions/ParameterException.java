package run.freshr.common.exceptions;

import static run.freshr.common.enumerations.StatusEnum.PARAMETER;

/**
 * 파라미터 에러
 *
 * @author FreshR
 * @apiNote 파라미터 에러 정의
 * @since 2024. 3. 26. 오후 5:09:34
 */
public class ParameterException extends RuntimeException {

  /**
   * 기본 메시지
   *
   * @apiNote 기본 메시지 설정
   * @since 2024. 3. 26. 오후 5:09:34
   */
  private final String message;

  /**
   * 생성자
   *
   * @apiNote 기본 생성자
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:09:34
   */
  public ParameterException() {
    super(PARAMETER.getMessage());
    this.message = PARAMETER.getMessage();
  }

  /**
   * 생성자
   *
   * @param message 메시지
   * @apiNote 메시지 생성자
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:09:34
   */
  public ParameterException(String message) {
    super(message);
    this.message = message;
  }

}
