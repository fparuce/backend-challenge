package br.com.fparuce.challengebackend.infra.mapper;

import br.com.fparuce.challengebackend.domain.model.AddressModel;
import br.com.fparuce.challengebackend.infra.entity.AddressEntity;
import org.springframework.stereotype.Component;

@Component
public class InfraAddressMapper {
    public AddressEntity modelToEntity(AddressModel model) {
        AddressEntity entity = new AddressEntity();
        entity.setStreet(model.getStreet());
        entity.setNumber(model.getNumber());
        entity.setComplement(model.getComplement());
        entity.setDistrict(model.getDistrict());
        entity.setCity(model.getCity());
        entity.setState(model.getState());
        entity.setStateInitials(model.getStateInitials());
        entity.setZipCode(model.getZipCode());
        entity.setCountry(model.getCountry());
        return entity;
    }

    public AddressModel entityToModel(AddressEntity entity) {
        AddressModel model = new AddressModel();
        model.setId(entity.getId());
        model.setStreet(entity.getStreet());
        model.setNumber(entity.getNumber());
        model.setComplement(entity.getComplement());
        model.setDistrict(entity.getDistrict());
        model.setCity(entity.getCity());
        model.setState(entity.getState());
        model.setStateInitials(entity.getStateInitials());
        model.setZipCode(entity.getZipCode());
        model.setCountry(entity.getCountry());
        return model;
    }
}
