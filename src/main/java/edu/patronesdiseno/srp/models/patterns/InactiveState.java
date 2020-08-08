package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class InactiveState implements CustomerState {

    private Customer customer;

    public InactiveState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void nextState() {
        System.out.println("Se encuentra desactivo");
    }

    @Override
    public void completeInfo() {
        System.out.println("Se encuentra desactivo");
    }

    @Override
    public void noActivity() {
        System.out.println("Se encuentra desactivo");
    }
}
