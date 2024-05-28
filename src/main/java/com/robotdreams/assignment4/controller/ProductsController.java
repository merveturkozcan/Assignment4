package com.robotdreams.assignment4.controller;

import com.robotdreams.assignment4.entity.Product;
import com.robotdreams.assignment4.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    @ResponseBody
    public String create(@RequestBody Product product) {
        return productService.create(product) ? "Successfully Created!" : "An unexpected error occured!";
    }

  /*  @PostMapping("/createProductYontem2")
    public ResponseEntity<String> createProductYontem2(@RequestBody Product product){
        productService.createProductYontem2(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Isleminiz Basarili") ;
    }*/

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }


}
