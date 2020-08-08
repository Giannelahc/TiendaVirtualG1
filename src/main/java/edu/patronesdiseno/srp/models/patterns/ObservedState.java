package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Customer;

public class ObservedState implements CustomerState{

    private Customer customer;

    public ObservedState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void nextState() {
        System.out.println("Debido a que se encuentra observado, no cuenta con un siguiente estado");
    }

    @Override
    public void completeInfo() {
        this.customer.changeState(new ActiveState(this.customer));
    }

    @Override
    public void noActivity() {
        System.out.println("Debido a que se encuentra observado, no afecta su no actividad");
    }
}
