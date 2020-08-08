package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Product;

public interface ProductCatalog {

    public void addProduct(Product product);

    public void removeProduct(Product product);

    public ProductIterator iterator(ProductLineEnum lineEnum);

    public void getAllProducts();

}