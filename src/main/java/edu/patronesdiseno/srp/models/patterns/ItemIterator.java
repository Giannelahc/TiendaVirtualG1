package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public interface ItemIterator {

    boolean hasNext();
    IOrderItem getNext();

}
