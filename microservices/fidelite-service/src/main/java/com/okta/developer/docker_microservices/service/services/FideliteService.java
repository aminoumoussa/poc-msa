package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.entities.Fidelite;

import java.util.List;

public interface FideliteService {

    List<Fidelite> listFidelites();
    Fidelite getFidelite(String client);
    void saveFidelite(Fidelite fidelite);

}
