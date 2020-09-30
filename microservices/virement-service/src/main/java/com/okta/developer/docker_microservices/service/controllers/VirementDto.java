package com.okta.developer.docker_microservices.service.controllers;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class VirementDto {

    @Min(10)
    @Max(10000)
    private Integer montant;

    @Size(max = 255)
    private String client;

    @Size(max = 255)
    private String beneficiaire;

    public VirementDto(Integer montant, String client, String beneficiaire) {
        this.montant = montant;
        this.client = client;
        this.beneficiaire = beneficiaire;
        
    }

    protected VirementDto() {}

    public Integer getMontant() {
        return montant;
    }

    public String getClient() { return client; }
    public String getBenef() { return beneficiaire; }

    

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public void setClient(String client) { this.client = client;}
    public void setBenef(String benef) { this.beneficiaire = benef;}

}
