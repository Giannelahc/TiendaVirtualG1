package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.Order;
import edu.patronesdiseno.srp.models.Product;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import edu.patronesdiseno.srp.models.patterns.ItemIterator;
import edu.patronesdiseno.srp.models.patterns.ItemsCollection;

public class OrderItemPromocion implements IOrderItem {

    //private Order order;
    //private Product product;
    private Integer quantity;
    private Double price;
    private ItemsCollection itemsCollection;

    public OrderItemPromocion(String idProduct,Integer quantity,Double price)  {
        //this.order = order;
        //this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemPromocion(){

    }

    @Override
    public Double calculatePrice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Double getPrice() {
        Double customPrice = 0.0;
        customPrice = this.price * this.quantity;

        // promo cuarentena, primera compra
        customPrice -= 20.0;

        if (customPrice < 0 ) {
            customPrice = 0.0;
        }
        return customPrice;
    }

    @Override
    public Integer getQuantity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setOrder(Order order) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getIdProduct() {
        return this.idProduct;
    }



}