
package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.dao.VirementDao;
import com.okta.developer.docker_microservices.service.entities.Virement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VirementServiceImpl implements VirementService {

    private final VirementDao virementDao;

    @Autowired
    public VirementServiceImpl(VirementDao virementDao) {
        this.virementDao = virementDao;
    }


    @Override
    public List<Virement> listVirements() {

        return virementDao.findAll();
    }

    @Override
    public void saveVirement(Virement virement){
        virementDao.save(virement);
    }
}
