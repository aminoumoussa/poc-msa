package com.okta.developer.docker_microservices.service.controllers;



import com.okta.developer.docker_microservices.service.entities.Fidelite;
import com.okta.developer.docker_microservices.service.controllers.FideliteDto;
import com.okta.developer.docker_microservices.service.services.FideliteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

import java.util.List;

@RestController
@RequestMapping("/fidelite")
public class FideliteController {


    private final FideliteService fideliteService;

    public FideliteController(FideliteService fideliteService) {
        this.fideliteService = fideliteService;
    }

    @GetMapping
    public List<Fidelite> listFidelites(){
        return fideliteService.listFidelites();
    }
 
    @PostMapping
    public void saveFidelite(@RequestBody @Validated FideliteDto fideliteDto){
        fideliteService.saveFidelite(new Fidelite(fideliteDto.getClient(), fideliteDto.getPoint()));
    }



}
