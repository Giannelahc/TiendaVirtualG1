package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public interface ItemsCollection {

    public void addItem(IOrderItem orderItem);

    public ItemIterator createItemIterator();

}
