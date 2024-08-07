package com.Thesis.waterfill.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Thesis.waterfill.NotFoundException.AdminNotFoundException;

    @RestController
    public class  AdminExceptionHandler {
        @ExceptionHandler(AdminNotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)

        String AdminNotFoundHandler
        (AdminNotFoundException e){
            return e.getMessage();
        }
    
        
    }

