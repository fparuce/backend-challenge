package br.com.fparuce.challengebackend.application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record CreateClientRequest(
        @NotEmpty @Size(max = 150, message = "Field 'name' must be less than {max} characters long") String name,
        @NotEmpty @JsonProperty("document_cpf") String document,
        @NotEmpty @Email @Size(max=100, message = "Field 'email' must be less than {max} characters long") String email,
        AddressRequest address) {
}
