/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.interfaces.ITransporte;

/**
 *
 * @author Giannela HC
 */
public class Auto implements ITransporte{

    private Double latitude;
    private Double longitude;
    
    @Override
    public Double getLatitude() {
        return this.latitude;
    }

    @Override
    public Double getLongitude() {
        return this.longitude;
    }

    @Override
    public Double calculaTiempo(int min) {
        return 40.0+min;
    }
    
}
