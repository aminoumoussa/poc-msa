package com.okta.developer.docker_microservices.service.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @Column
    private String client;

    @NonNull
    @Column
    private String beneficiaire;
    
    @NonNull
    @Column
    private Integer montant;

    public Virement(String client, String beneficiaire, Integer montant) {
        this.client = client;
        this.beneficiaire = beneficiaire;
        this.montant = montant;
    }

    protected Virement() {

    }
    public Long getId() {
        return id;
    }

    public Integer getMontant() {
        return montant;
    }

    public String getClient() { return client; }
    public String getBeneficiaire() { return beneficiaire; }

    

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public void setClient(String client) { this.client = client;}
    public void setBenef(String benef) { this.beneficiaire = benef;}



}
