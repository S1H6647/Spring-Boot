package com.service;

import com.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final Product product;
    List<Product> products = new ArrayList<>();

     {
        products.add(new Product(101, "Iphone", 120_000));
        products.add(new Product(102, "Mouse", 1200));
        products.add(new Product(103, "Asus TUF A15", 120_000));
    }

    public ProductService(Product product) {
        this.product = product;
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        Product p;
        for (Product product1 : products){
            if (product1.getProductId() == id){
                p = product1;
                return p;
            }
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            return new Product(000,"No item",000);
        }
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
         int index = 0;
         for (int i = 0; i < products.size(); i ++){
             if (products.get(i).getProductId() == product.getProductId()){
                 index = i;
             }
         }
         products.set(index,product);
    }

    public void deleteProduct(int productId){
        products.removeIf(p -> p.getProductId() == productId); //` Collection removeif
    }
}
