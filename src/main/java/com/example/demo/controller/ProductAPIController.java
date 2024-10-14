package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductAPIController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<Product> getProductList(long id) {
        Product product = productService.getProduct(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(@RequestBody Product productData) {
        Product product = productService.createProduct(productData);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PutMapping("/update-product")
    public ResponseEntity<Product> updateProduct(@RequestBody Product productData) {
        Product product = productService.updateProduct(productData);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/delete-product")
    public ResponseEntity<String> updateProduct(long productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
