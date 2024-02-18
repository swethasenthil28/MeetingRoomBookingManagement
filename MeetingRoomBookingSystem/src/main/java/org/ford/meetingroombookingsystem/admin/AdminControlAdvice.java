package org.ford.meetingroombookingsystem.admin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdminControlAdvice {
    @ExceptionHandler(value = {AdminException.class})
    public ResponseEntity<String> accountExceptionHandler(AdminException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
