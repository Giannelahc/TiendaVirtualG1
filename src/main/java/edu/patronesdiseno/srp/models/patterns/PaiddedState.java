/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Order;
import edu.patronesdiseno.srp.models.EnumState;

/**
 *
 * @author Giannela HC
 */
public class PaiddedState implements OrderState{

    public PaiddedState() {}

    @Override
    public void next(Order order) {
        if(order.getEnumstate() == EnumState.COMPLETED)
            order.setState(new CompletedState());
        else{
            order.setEnumstate(EnumState.DELIVERED);
            order.setState(new DeliveredState());
        }
    }

    @Override
    public void prev(Order order) {
        order.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order paidded");
    }
    
}
