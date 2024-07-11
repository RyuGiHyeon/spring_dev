package springboot3.jeff.apiPayload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import springboot3.jeff.apiPayload.code.BaseErrorCode;
import springboot3.jeff.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}