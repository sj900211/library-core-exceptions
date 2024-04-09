package run.freshr.common.exceptions;

import static run.freshr.common.enumerations.StatusEnum.DUPLICATE;

/**
 * 중복 에러
 *
 * @author FreshR
 * @apiNote 중복 에러 정의
 * @since 2024. 3. 26. 오후 5:09:34
 */
public class DuplicateException extends RuntimeException {

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
  public DuplicateException() {
    super(DUPLICATE.getMessage());
    this.message = DUPLICATE.getMessage();
  }

  /**
   * 생성자
   *
   * @param message 메시지
   * @apiNote 메시지 생성자
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:09:34
   */
  public DuplicateException(String message) {
    super(message);
    this.message = message;
  }

}
