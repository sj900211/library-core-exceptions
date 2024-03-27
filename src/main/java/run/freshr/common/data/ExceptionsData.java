package run.freshr.common.data;

import lombok.Builder;
import lombok.Data;

/**
 * 예외 데이터 모델
 *
 * @author FreshR
 * @apiNote 예외 데이터 모델
 * @since 2024. 3. 26. 오후 5:03:49
 */
@Data
@Builder
public class ExceptionsData {

  /**
   * 성공 데이터
   *
   * @apiNote 성공 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData success;
  /**
   * Parameter 예외 데이터
   *
   * @apiNote Parameter 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData parameter;
  /**
   * Duplicate 예외 데이터
   *
   * @apiNote Duplicate 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData duplicate;
  /**
   * Un authenticated 예외 데이터
   *
   * @apiNote Un authenticated 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData unAuthenticated;
  /**
   * Null pointer 예외 데이터
   *
   * @apiNote Null pointer 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData nullPointer;
  /**
   * Entity not found 예외 데이터
   *
   * @apiNote Entity not found 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData entityNotFound;
  /**
   * Io 예외 데이터
   *
   * @apiNote Io 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData io;
  /**
   * File size limit exceeded 예외 데이터
   *
   * @apiNote File size limit exceeded 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData fileSizeLimitExceeded;
  /**
   * Json 예외 데이터
   *
   * @apiNote Json 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData json;
  /**
   * Json processing 예외 데이터
   *
   * @apiNote Json processing 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData jsonProcessing;
  /**
   * Sql syntax error 예외 데이터
   *
   * @apiNote Sql syntax error 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData sqlSyntaxError;
  /**
   * Invalid data access resource usage 예외 데이터
   *
   * @apiNote Invalid data access resource usage 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData invalidDataAccessResourceUsage;
  /**
   * Data integrity violation 예외 데이터
   *
   * @apiNote Data integrity violation 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData dataIntegrityViolation;
  /**
   * Batch update 예외 데이터
   *
   * @apiNote Batch update 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData batchUpdate;
  /**
   * Sql grammar 예외 데이터
   *
   * @apiNote Sql grammar 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData sqlGrammar;
  /**
   * Constraint violation 예외 데이터
   *
   * @apiNote Constraint violation 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData constraintViolation;
  /**
   * Data 예외 데이터
   *
   * @apiNote Data 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData data;
  /**
   * Access denied 예외 데이터
   *
   * @apiNote Access denied 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData accessDenied;
  /**
   * Illegal state 예외 데이터
   *
   * @apiNote Illegal state 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData illegalState;
  /**
   * Illegal argument 예외 데이터
   *
   * @apiNote Illegal argument 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData illegalArgument;
  /**
   * Jwt 예외 데이터
   *
   * @apiNote Jwt 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData jwt;
  /**
   * Expired jwt 예외 데이터
   *
   * @apiNote Expired jwt 예외 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData expiredJwt;
  /**
   * 에러 데이터
   *
   * @apiNote 에러 데이터
   * @since 2024. 3. 26. 오후 5:03:49
   */
  private ExceptionData error;

}
