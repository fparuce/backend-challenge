package br.com.fparuce.challengebackend.domain.port.incoming.client;

import br.com.fparuce.challengebackend.application.response.ClientResponse;

public interface IGetClientUseCase {
    ClientResponse getClientByDocument(String document);
}
