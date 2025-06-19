package com.service;

import com.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 120000),
            new Product(102, "Mouse", 1200)
    );

    public List<Product> getProducts(){
        return products;
    }

}
