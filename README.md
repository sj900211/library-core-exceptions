# Library > Core > Exceptions
> 예외 처리 설정 관리
> - ## [ErrorsSerializer](./src/main/java/run/freshr/common/serializer/ErrorsSerializer.java)
>> 전역에서 발생할 수 있는 예외를 반환할 때 반환되는 형식을 정의
> - ## exceptions
>> 제공되는 예외 항목 외에 자주 사용하는 예외 항목 정의
>> - ### [DuplicateException](./src/main/java/run/freshr/common/exceptions/DuplicateException.java)
>>> 중복 예외 처리
>> - ### [ParameterException](./src/main/java/run/freshr/common/exceptions/ParameterException.java)
>>> parameter 예외 처리  
>>> 요청 데이터 검증 처리 후 예외 처리를 할 때 사용
>> - ### [UnAuthenticatedException](./src/main/java/run/freshr/common/exceptions/UnAuthenticatedException.java)
>>> 인증 예외 처리
> - ## [StatusEnum](./src/main/java/run/freshr/common/enumerations/StatusEnum.java)
>> 제공되는 예외 항목과 정의한 예외 항목에 대해  
>> 에러 반환에 필요한 정보의 기본값을 정의
> - ## [ExceptionsProperties](./src/main/java/run/freshr/common/properties/ExceptionsProperties.java)
>> 프로젝트에 따라 변경되는 예외 항목의 정보를 변경할 수 있는 Properties 정의  
>> 프로젝트에서 사용할 때에는 application.yml 에서 각 정보를 변경할 수 있다.
>> ``` yaml
>> freshr:
>>   exception:
>>     un-authenticated:
>>       status: unauthorized
>>       message: "처리되었습니다."
>>       code: "UAERROR"
>> ```
>> 위처럼 변경하면 ExceptionsData 에 설정된다.  
>> ExceptionsProperties 에서는 lowerCameCase 형식이었지만  
>> application.yml 에서는 lower-hypen 으로 작성된다.
> - ## [ExceptionsAutoConfiguration](./src/main/java/run/freshr/common/configurations/ExceptionsAutoConfiguration.java)
>> StatusEnum 과 ExceptionsProperties 에 설정한 값으로 ExceptionsData 를 빌드한다.
> - ## [ExceptionsData](./src/main/java/run/freshr/common/data/ExceptionsData.java)
>> StatusEnum 과 ExceptionsProperties 에 설정한 값으로 빌드되는 Class.  
>> 이 Class 를 프로젝트에서 주입받아 사용
> - ## [ExceptionData](./src/main/java/run/freshr/common/data/ExceptionData.java)
>> 빌드될 데이터에 대한 공통 모델