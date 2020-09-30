package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.entities.Virement;

import java.util.List;

public interface VirementService {

    List<Virement> listVirements();
    void saveVirement(Virement virement);

}
