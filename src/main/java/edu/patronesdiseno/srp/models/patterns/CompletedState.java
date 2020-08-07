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
public class CompletedState implements OrderState{

    public CompletedState() {}

    @Override
    public void next(Order order) {
        System.out.println("This order is already completed by a client.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new ReceivedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Completed!");
    }
    
}
