package com.controller;

import com.model.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){ //` To request the data from the HTML body
        System.out.println(product);
        productService.addProduct(product);
    }
}
