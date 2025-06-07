package br.com.fparuce.challengebackend.application.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AddressRequest(
        @NotEmpty @Size(max=250, message = "Fiel 'street' must be less then {max} characters long") String street,
        @NotNull String number,
        String complement,
        String district,
        @NotEmpty String city,
        String state,
        @NotEmpty String stateInitials,
        @NotEmpty String zipCode,
        @NotEmpty String country
) {
}
