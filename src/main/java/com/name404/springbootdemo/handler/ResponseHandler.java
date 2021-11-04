package com.name404.springbootdemo.handler;

import com.name404.springbootdemo.common.exception.CustomException;
import com.name404.springbootdemo.common.vo.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class ResponseHandler {
    private static Logger logger = LoggerFactory.getLogger(ResponseHandler.class);

    @ExceptionHandler({CustomException.class})
    public JSONResult customException(CustomException e, HttpServletRequest request) {
        logger.error(request.getRequestURI() + ":服务运行异常", e);
        return JSONResult.errorException(e.getErrorCodeEnum().getErrorCode().intValue(), e.getErrorCodeEnum().getErrorMsg());
    }

    @ExceptionHandler({Exception.class})
    public JSONResult otherResponse(Exception e, HttpServletRequest request) {
        logger.error(request.getRequestURI() + ":捕获全局异常", e);
        return JSONResult.errorException(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                e.getMessage());
    }
}