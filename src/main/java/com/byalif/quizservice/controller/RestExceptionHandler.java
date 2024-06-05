package com.byalif.quizservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.byalif.quizservice.entity.ErrorDto;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;


@EnableWebMvc
@ControllerAdvice
public class RestExceptionHandler {

    
    @ExceptionHandler(value = { Exception.class })
    @ResponseBody
    public ResponseEntity<ErrorDto> authenticationException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorDto(ex.getMessage()));
    }

}