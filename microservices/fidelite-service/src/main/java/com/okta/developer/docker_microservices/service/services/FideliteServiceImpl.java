
package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.dao.FideliteDao;
import com.okta.developer.docker_microservices.service.entities.Fidelite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FideliteServiceImpl implements FideliteService {

    private final FideliteDao FideliteDao;

    @Autowired
    public FideliteServiceImpl(FideliteDao FideliteDao) {
        this.FideliteDao = FideliteDao;
    }


    @Override
    public List<Fidelite> listFidelites() {

        return FideliteDao.findAll();
    }

    @Override
    public Fidelite getFidelite(String client) {

        return FideliteDao.findByClient(client);
    }

    @Override
    public void saveFidelite(Fidelite fidelite){
        FideliteDao.save(fidelite);
    }
}
