package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class CreatedState implements CustomerState{

   private Customer customer;

    public CreatedState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void nextState() {
        this.customer.changeState(new ActiveState(this.customer));
    }

    @Override
    public void completeInfo() {
        this.customer.changeState(new ActiveState(this.customer));
    }

    @Override
    public void noActivity() {
        System.out.println("Recién creado");
    }

}
