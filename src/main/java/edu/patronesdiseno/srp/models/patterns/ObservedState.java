package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ObservedState implements CustomerState{

    private Customer customer;

    public ObservedState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void nextState() {
        System.out.println("Se encuentra observado");
    }

    @Override
    public void completeInfo() {
        this.customer.changeState(new ActiveState(this.customer));
    }

    @Override
    public void noActivity() {
        System.out.println("Se encuentra observado");
    }
}
