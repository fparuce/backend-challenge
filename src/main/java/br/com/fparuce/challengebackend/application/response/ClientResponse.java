package br.com.fparuce.challengebackend.application.response;

public record ClientResponse(
        String id,
        String name,
        String document,
        String email,
        AddressResponse address
) {}
