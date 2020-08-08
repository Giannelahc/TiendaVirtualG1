package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.Product;

import java.util.List;

public class ConcreteProductIterator implements ProductIterator {

    private ProductLineEnum productLine;
    private List<Product> products;
    private int currentPosition;

    public ConcreteProductIterator(ProductLineEnum productLine, List<Product> products) {
        this.productLine = productLine;
        this.products = products;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentPosition < products.size()) {
            Product product = products.get(currentPosition);
            if(product.getProductLine().equals(productLine) || productLine.equals(ProductLineEnum.ALL)) {
                return true;
            } else {
                currentPosition ++;
            }
        }
        return false;
    }

    @Override
    public Product getNext() {
        return products.get(currentPosition++);
    }

    @Override
    public Product currentProduct() {
        return products.get(currentPosition);
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
