package com.service;

import com.model.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int productId){
        return productRepository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
         productRepository.save(product);
    }

    //` save method checks whether the list has 'product' or not. If not it adds, and updates correspondingly

    public void deleteProduct(int productId){
        productRepository.deleteById(productId);
    }
}
