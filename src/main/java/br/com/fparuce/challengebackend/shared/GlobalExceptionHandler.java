package br.com.fparuce.challengebackend.shared;

import br.com.fparuce.challengebackend.infra.exception.ClientDocumentExistsException;
import br.com.fparuce.challengebackend.infra.exception.ClientDocumentInvalidException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(
            HttpMessageNotReadableException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request) {
        LOGGER.error("Request body is invalid or missing: {}", ex.getMessage(), ex);
        String msg = "Request body is required and must be a valid JSON.";
        ErrorResponse errorResponse = new ErrorResponse(msg, HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request
    ) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        LOGGER.error("Validation error: {}", errors, ex);
        String msg = "Validation error(s): " + String.join("; ", errors);
        ErrorResponse errorResponse = new ErrorResponse(msg, HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(ClientDocumentInvalidException.class)
    public ResponseEntity<ErrorResponse> handleClientDocumentInvalidException(ClientDocumentInvalidException ex) {
        LOGGER.error("Error to validate document: {}", ex.getMessage(), ex);
        return buildErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ClientDocumentExistsException.class)
    public ResponseEntity<ErrorResponse> handleClientDocumentExistsException(ClientDocumentExistsException ex) {
        LOGGER.error("Client document already exists: {}", ex.getMessage(), ex);
        return buildErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(String msg, HttpStatus status) {
        ErrorResponse error = new ErrorResponse(msg, status.value());
        return new ResponseEntity<>(error, status);
    }


}
