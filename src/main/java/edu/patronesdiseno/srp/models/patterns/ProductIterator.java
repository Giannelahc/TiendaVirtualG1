package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Product;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;

public interface ProductIterator {

    boolean hasNext();
    Product getNext();
    Product currentProduct();
    void reset();

}
