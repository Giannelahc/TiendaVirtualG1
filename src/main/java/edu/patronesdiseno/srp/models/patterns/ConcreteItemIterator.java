package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

import java.util.ArrayList;
import java.util.List;

public class ConcreteItemIterator implements ItemIterator {

    private ConcreteItemsCollection concreteItemsCollection;
    private List<IOrderItem> items = new ArrayList<>();
    private int currentPosition = 0;

    public ConcreteItemIterator(ConcreteItemsCollection concreteItemsCollection, List<IOrderItem> items) {
        this.concreteItemsCollection = concreteItemsCollection;
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < items.size();
    }

    @Override
    public IOrderItem getNext() {
        if (!hasNext()) {
            System.out.println();
        }

        IOrderItem iOrderItem = items.get(currentPosition);
        if (iOrderItem == null) {
            items.set(currentPosition, iOrderItem);
        }
        currentPosition++;
        return iOrderItem;
    }

}
