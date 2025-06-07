package br.com.fparuce.challengebackend.domain.port.outcoming.client;

import br.com.fparuce.challengebackend.domain.model.ClientModel;

public interface IClientPersistencePort {

    ClientModel save(ClientModel model);

    ClientModel findByDocument(String document);

    boolean existsByDocument(String document);

}
