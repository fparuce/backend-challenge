package br.com.fparuce.challengebackend.domain.usecase;

import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;
import br.com.fparuce.challengebackend.domain.port.incoming.client.CreateClientUseCase;
import br.com.fparuce.challengebackend.domain.port.incoming.client.GetClientUseCase;
import org.springframework.stereotype.Service;

@Service
public class ClientUseCaseImpl implements CreateClientUseCase, GetClientUseCase {
    @Override
    public ClientResponse createCLient(CreateClientRequest request) {
        return null;
    }

    @Override
    public ClientResponse getClientByDocument(String document) {
        return null;
    }
}
