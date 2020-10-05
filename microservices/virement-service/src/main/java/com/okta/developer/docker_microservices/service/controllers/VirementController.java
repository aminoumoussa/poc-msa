package com.okta.developer.docker_microservices.service.controllers;



import com.okta.developer.docker_microservices.service.entities.Virement;
import com.okta.developer.docker_microservices.service.controllers.VirementDto;
import com.okta.developer.docker_microservices.service.services.VirementService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

import java.util.List;

@RestController
@RequestMapping("/virement")
public class VirementController {


    private final VirementService virementService;

    public VirementController(VirementService virementService) {
        this.virementService = virementService;
    }

    @RequestMapping(value="/list")
    public List<Virement> listVirements(){
        return virementService.listVirements();
    }
 
    @PostMapping(value="/save")
    public void saveVirement(@RequestBody @Validated VirementDto virementDto){
        virementService.saveVirement(new Virement(virementDto.getClient(), virementDto.getBeneficiaire(), virementDto.getMontant()));
    }



}
