package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.Fidelite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FideliteDao extends JpaRepository<Fidelite, Long> {

    @Query("select u from Fidelite u where u.client = ?1")
    Fidelite findByClient(String client);

}
