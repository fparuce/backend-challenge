package br.com.fparuce.challengebackend.infra.repository.impl;

import br.com.fparuce.challengebackend.domain.model.ClientModel;
import br.com.fparuce.challengebackend.domain.port.outcoming.client.IClientPersistencePort;
import br.com.fparuce.challengebackend.infra.mapper.InfraClientMapper;
import br.com.fparuce.challengebackend.infra.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ClientPersistencePort implements IClientPersistencePort {

    private final ClientRepository clientRepository;
    private final InfraClientMapper infraClientMapper;

    @Override
    public ClientModel save(ClientModel model) {
        return infraClientMapper.entityToModel(clientRepository.save(infraClientMapper.modelToEntity(model)));
    }

    @Override
    public ClientModel findByDocument(String document) {
        return null;
    }

    @Override
    public boolean existsByDocument(String document) {
        return clientRepository.existsByDocument(document);
    }
}
