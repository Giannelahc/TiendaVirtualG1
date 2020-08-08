package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Product;

import java.util.List;

public class CatalogCollection implements ProductCatalog{

    List<Product> products;

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void removeProduct(Product product) {

    }

    @Override
    public ProductIterator iterator(ProductLineEnum lineEnum) {
        return new ConcreteProductIterator(lineEnum, this.products);
    }

    @Override
    public void getAllProducts() {
    }

}
