package br.com.fparuce.challengebackend.application.request;

public record CreateClientRequest(
        String name,
        String document,
        String email,
        Address address) {
    public record Address(
        String street,
        String number,
        String complement,
        String district,
        String city,
        String state,
        String stateInitials,
        String zipCode,
        String country
    ){}
}
