package edu.patronesdiseno.srp.models;

import edu.patronesdiseno.srp.models.patterns.CreatedState;
import edu.patronesdiseno.srp.models.patterns.CustomerState;

public class Customer {
    private String id;
    private String name;
    private String address;
    private CustomerState state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerState getState() {
        return state;
    }

    public void setState(CustomerState state) {
        this.state = state;
    }

    public Customer() {
        this.state = new CreatedState(this);
    }

    public void changeState(CustomerState state){
        this.state = state;
    }

    public void nextState(){
        this.state.nextState();
    }

    public void completeInfo(){
        this.state.completeInfo();
    }

    public void noActivity(){
        this.state.noActivity();
    }

}