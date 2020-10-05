package com.okta.developer.docker_microservices.service.controllers;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class FideliteDto {

    @Min(1)
    private Integer point;

    @Size(max = 255)
    private String client;


    public FideliteDto(Integer point, String client) {
        this.point = point;
        this.client = client;
    }

    protected FideliteDto() {}

    public Integer getPoint() {
        return point;
    }

    public String getClient() { return client; }
   

    

    public void setPoint(Integer point) {
        this.point = point;
    }

    public void setClient(String client) { this.client = client;}

}
