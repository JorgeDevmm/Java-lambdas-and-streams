package com.project.fundamentals;

import java.util.List;

public class ProductDB implements DatabaseService<Product>{
    @Override
    public Product getById(Long id) {

        Product product = new Product();
        product.setId(id);
        product.setName("Tamales");
        product.setPrice(13.0);

        return product;
    }

    @Override
    public List<Product> getAllRecords() {
        return null;
    }
}
