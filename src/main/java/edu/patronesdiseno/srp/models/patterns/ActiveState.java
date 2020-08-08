package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ActiveState implements CustomerState{

    private Customer customer;

    public ActiveState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void nextState() {
        System.out.println("Se mantiene activo");
    }

    @Override
    public void completeInfo() {
        System.out.println("Se mantiene activo");
    }

    @Override
    public void noActivity() {
        this.customer.changeState(new InactiveState(this.customer));
    }
}
