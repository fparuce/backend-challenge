package br.com.fparuce.challengebackend.application.rest.impl;

import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;
import br.com.fparuce.challengebackend.application.rest.ClientController;
import br.com.fparuce.challengebackend.domain.port.incoming.client.CreateClientUseCase;
import br.com.fparuce.challengebackend.domain.port.incoming.client.GetClientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientControllerImpl implements ClientController {

    private final CreateClientUseCase createClientUseCase;
    private final GetClientUseCase getClientUseCase;

    @Override
    @PostMapping
    public ResponseEntity<ClientResponse> createClient(CreateClientRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<ClientResponse> getClientByDocument(String document) {
        return null;
    }
}
