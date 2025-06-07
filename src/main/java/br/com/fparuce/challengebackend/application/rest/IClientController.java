package br.com.fparuce.challengebackend.application.rest;

import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IClientController {

    ResponseEntity<ClientResponse> createClient(@Valid @RequestBody CreateClientRequest request);

    ResponseEntity<ClientResponse> getClientByDocument(@PathVariable String document);
}
