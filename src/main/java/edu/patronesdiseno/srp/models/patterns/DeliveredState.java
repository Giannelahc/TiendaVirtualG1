package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.EnumState;
import edu.patronesdiseno.srp.models.Order;

public class DeliveredState implements OrderState {

    public DeliveredState(){}

    @Override
    public void next(Order order) {
        order.setEnumstate(EnumState.RECEIVED);
        order.setState(new ReceivedState());
    }

    @Override
    public void prev(Order order) {
        order.setEnumstate(EnumState.PAIDDED);
        order.setState(new PaiddedState());
    }

    @Override
    public void printStatus(){
        System.out.println("Delivered!");
    }
}