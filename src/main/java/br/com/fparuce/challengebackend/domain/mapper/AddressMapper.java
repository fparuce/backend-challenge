package br.com.fparuce.challengebackend.domain.mapper;

import br.com.fparuce.challengebackend.application.request.AddressRequest;
import br.com.fparuce.challengebackend.application.response.AddressResponse;
import br.com.fparuce.challengebackend.domain.model.AddressModel;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressResponse toResponse(AddressModel model) {
        return new AddressResponse(
                model.getStreet(),
                model.getNumber(),
                model.getComplement(),
                model.getDistrict(),
                model.getCity(),
                model.getState(),
                model.getStateInitials(),
                model.getZipCode(),
                model.getCountry()
        );
    }

    public AddressModel toModel(AddressRequest request) {
        return new AddressModel(
                request.street(),
                request.number(),
                request.complement(),
                request.district(),
                request.city(),
                request.state(),
                request.stateInitials(),
                request.zipCode(),
                request.country()
        );
    }
}
