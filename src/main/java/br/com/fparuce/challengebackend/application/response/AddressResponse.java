package br.com.fparuce.challengebackend.application.response;

public record AddressResponse(
        String street,
        String number,
        String complement,
        String district,
        String city,
        String state,
        String stateInitials,
        String zipCode,
        String country
) {}
