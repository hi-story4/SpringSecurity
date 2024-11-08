package com.ai.inthon.constant.exception;

import com.ai.inthon.constant.response.CustomResponseStatus;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private final CustomResponseStatus customResponseStatus;


    public CustomException(CustomResponseStatus customResponseStatus) {

        super(customResponseStatus.getMessage());
        this.customResponseStatus = customResponseStatus;
    }
}


