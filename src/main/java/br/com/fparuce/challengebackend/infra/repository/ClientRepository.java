package br.com.fparuce.challengebackend.infra.repository;

import br.com.fparuce.challengebackend.infra.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    boolean existsByDocument(String document);

    ClientEntity findByDocument(String document);
}
