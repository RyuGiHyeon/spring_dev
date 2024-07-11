package springboot3.jeff.apiPayload.exception.handler;


import springboot3.jeff.apiPayload.code.BaseErrorCode;
import springboot3.jeff.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {

    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
