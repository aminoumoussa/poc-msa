package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VirementDao extends JpaRepository<Virement, Long> {


}
