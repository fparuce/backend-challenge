package br.com.fparuce.challengebackend.application.rest.impl;

import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;
import br.com.fparuce.challengebackend.application.rest.IClientController;
import br.com.fparuce.challengebackend.domain.port.incoming.client.ICreateClientUseCase;
import br.com.fparuce.challengebackend.domain.port.incoming.client.IGetClientUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController implements IClientController {

    private final ICreateClientUseCase ICreateClientUseCase;
    private final IGetClientUseCase IGetClientUseCase;

    @Override
    @PostMapping
    public ResponseEntity<ClientResponse> createClient(@Valid @RequestBody CreateClientRequest request) {
        ClientResponse response = ICreateClientUseCase.createClient(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    @GetMapping("/{document}")
    public ResponseEntity<ClientResponse> getClientByDocument(@PathVariable String document) {
        return null;
    }
}
