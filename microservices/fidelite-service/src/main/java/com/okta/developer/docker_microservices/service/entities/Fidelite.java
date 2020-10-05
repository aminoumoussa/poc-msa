package com.okta.developer.docker_microservices.service.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Fidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @Column
    private String client;

    @NonNull
    @Column
    private Integer point;

    public Fidelite(String client, Integer point) {
        this.client = client;
        this.point = point;
    }

    protected Fidelite() {

    }
    public Long getId() {
        return id;
    }

    public Integer getPoint() {
        return point;
    }

    public String getClient() { return client; }
    
    public void setPoint(Integer point) {
        this.point = point;
    }

    public void setClient(String client) { this.client = client;}



}
