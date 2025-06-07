package br.com.fparuce.challengebackend.application.response;

public record ClientResponse(
        Long id,
        String name,
        String document,
        String email,
        AddressResponse address
) {}
