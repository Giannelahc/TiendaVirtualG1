/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;

/**
 *
 * @author Giannela HC
 */
public class NormalOrder extends Order{
    
    private int minTrafico;
    
    @Override
    public Double calculaTiempoLlegada(){
        this.minTrafico = (int) Math.floor(Math.random()*6+1);
        return transporte.calculaTiempo(this.minTrafico);//
    }
}
