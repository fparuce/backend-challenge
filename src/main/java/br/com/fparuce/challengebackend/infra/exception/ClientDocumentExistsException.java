package br.com.fparuce.challengebackend.infra.exception;

public class ClientDocumentExistsException extends RuntimeException {
    public ClientDocumentExistsException() {
        super("The document already exists.");
    }
}
