package br.com.fparuce.challengebackend.domain.usecase;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.fparuce.challengebackend.application.request.CreateClientRequest;
import br.com.fparuce.challengebackend.application.response.ClientResponse;
import br.com.fparuce.challengebackend.domain.mapper.AddressMapper;
import br.com.fparuce.challengebackend.domain.mapper.ClientMapper;
import br.com.fparuce.challengebackend.domain.model.ClientModel;
import br.com.fparuce.challengebackend.domain.port.incoming.client.ICreateClientUseCase;
import br.com.fparuce.challengebackend.domain.port.incoming.client.IGetClientUseCase;
import br.com.fparuce.challengebackend.domain.port.outcoming.client.IClientPersistencePort;
import br.com.fparuce.challengebackend.infra.exception.ClientDocumentExistsException;
import br.com.fparuce.challengebackend.infra.exception.ClientDocumentInvalidException;
import org.springframework.stereotype.Service;

@Service
public class ClientUseCase implements ICreateClientUseCase, IGetClientUseCase {

    private final IClientPersistencePort clientPersistencePort;

    private final ClientMapper clientMapper;
    private final AddressMapper addressMapper;

    public ClientUseCase(IClientPersistencePort clientPersistencePort, ClientMapper clientMapper, AddressMapper addressMapper) {
        this.clientPersistencePort = clientPersistencePort;
        this.clientMapper = clientMapper;
        this.addressMapper = addressMapper;
    }

    @Override
    public ClientResponse createClient(CreateClientRequest request) {
        ClientModel model = new ClientModel(request.name(), request.document(), request.email(), addressMapper.toModel(request.address()));
        if(!validateDocument(model.getDocument())){
            throw new ClientDocumentInvalidException();
        }

        if (clientPersistencePort.existsByDocument(model.getDocument())) {
            throw new ClientDocumentExistsException();
        }

        //TODO: Validar CEP.
        //Salvar endereço primeiro?
        ClientModel client = clientPersistencePort.save(model);
        return clientMapper.modelToResponse(client);
    }

    @Override
    public ClientResponse getClientByDocument(String document) {
        return null;
    }

    private boolean validateDocument(String document) {
        CPFValidator cpfValidator = new CPFValidator();
        try {
            cpfValidator.assertValid(document);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
