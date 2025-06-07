package br.com.fparuce.challengebackend.infra.mapper;

import br.com.fparuce.challengebackend.domain.model.ClientModel;
import br.com.fparuce.challengebackend.infra.entity.ClientEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class InfraClientMapper {
    private final InfraAddressMapper infraAddressMapper;

    public ClientModel entityToModel(ClientEntity entity) {
        ClientModel model = new ClientModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setDocument(entity.getDocument());
        model.setEmail(entity.getEmail());
        model.setAddressModel(infraAddressMapper.entityToModel(entity.getAddress()));
        return model;
    }

    public ClientEntity modelToEntity(ClientModel model) {
        ClientEntity entity = new ClientEntity();
        entity.setName(model.getName());
        entity.setDocument(model.getDocument());
        entity.setEmail(model.getEmail());
        entity.setAddress(infraAddressMapper.modelToEntity(model.getAddressModel()));
        return entity;
    }
}
