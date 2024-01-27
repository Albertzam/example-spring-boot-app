package com.example.demo.errors.infra.inputAdapter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.demo.errors.aplication.Errors;
import com.example.demo.errors.domain.CustomError;
import com.example.demo.errors.domain.ReturningError;
import jakarta.annotation.Resource;

@ControllerAdvice
public class Error {
    @Resource
    Errors errors;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> customException(Exception ex) {

        if (ex instanceof CustomError) {
            System.out.println("This is instance custom error");
        }
        // ReturningError response = errors.getError(ex.getCode().name(),
        // ex.getMessage());
        // return new ResponseEntity<>(response,
        // HttpStatus.valueOf(response.getStatus()));
        String mensaje = "Se ha producido un error: " + ex.getMessage();
        // Puedes registrar el mensaje, enviar una notificación, etc.

        // Devolver una respuesta con el mensaje de error y el código de estado 500
        return new ResponseEntity<>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
