package com.atguigu.product.controller;

import com.atguigu.product.bean.Product;
import com.atguigu.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

//@RequestMapping("/api/product")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        System.out.println("hello");
        Product product = productService.getProductById(productId);
        /*try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        return product;
    }
}
