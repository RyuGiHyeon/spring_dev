package springboot3.jeff.apiPayload.exception.handler;

import springboot3.jeff.apiPayload.code.BaseErrorCode;
import springboot3.jeff.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
