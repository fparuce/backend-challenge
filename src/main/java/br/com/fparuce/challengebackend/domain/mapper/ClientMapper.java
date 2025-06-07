package br.com.fparuce.challengebackend.domain.mapper;

import br.com.fparuce.challengebackend.application.response.ClientResponse;
import br.com.fparuce.challengebackend.domain.model.ClientModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ClientMapper {
    private final AddressMapper addressMapper;

    public ClientResponse modelToResponse(ClientModel model) {
        return new ClientResponse(
                model.getId(),
                model.getName(),
                model.getDocument(),
                model.getEmail(),
                addressMapper.toResponse(model.getAddressModel())
        );
    }
}
