package br.com.fparuce.challengebackend.domain.port.incoming.client;

import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;

public interface CreateClientUseCase {
    ClientResponse createCLient(CreateClientRequest request);
}
