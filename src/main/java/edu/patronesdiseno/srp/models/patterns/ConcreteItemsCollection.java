package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteItemsCollection implements ItemsCollection{

    List<IOrderItem> items;

    public ConcreteItemsCollection() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(IOrderItem iOrderItem) {
        this.items.add(iOrderItem);
    }

    @Override
    public ItemIterator createItemIterator() {
        return new ConcreteItemIterator(this, this.items);
    }
}
