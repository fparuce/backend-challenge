package br.com.fparuce.challengebackend.domain.port.incoming.client;

import br.com.fparuce.challengebackend.application.response.ClientResponse;

public interface GetClientUseCase {
    ClientResponse getClientByDocument(String document);
}
