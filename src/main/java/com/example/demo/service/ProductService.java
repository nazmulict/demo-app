package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product productData){
        return productRepository.save(productData);
    }

    public Product getProduct(long productId){
        return productRepository.findProductById(productId);
    }

    public Product updateProduct(Product productData){
        Product updateProduct = productRepository.findProductById(productData.getId());
        updateProduct.setName(productData.getName());
        updateProduct.setPrice(productData.getPrice());
        return productRepository.save(updateProduct);
    }

    public void deleteProduct(long productId){
        Product deleteProduct = productRepository.findProductById(productId);
        productRepository.delete(deleteProduct);
    }

}
