package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.EnumState;
import edu.patronesdiseno.srp.models.Order;

public class ReceivedState implements OrderState {

    public ReceivedState(){}

    @Override
    public void next(Order order) {
        order.setEnumstate(EnumState.COMPLETED);
        order.setState(new CompletedState());
    }

    @Override
    public void prev(Order order) {
        order.setEnumstate(EnumState.DELIVERED);
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus(){
        System.out.println("Order Received!");
    }
}