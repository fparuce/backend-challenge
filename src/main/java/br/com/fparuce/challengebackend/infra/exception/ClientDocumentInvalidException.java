package br.com.fparuce.challengebackend.infra.exception;

public class ClientDocumentInvalidException extends RuntimeException{
    public ClientDocumentInvalidException() {
        super("The document is invalid.");
    }
}
