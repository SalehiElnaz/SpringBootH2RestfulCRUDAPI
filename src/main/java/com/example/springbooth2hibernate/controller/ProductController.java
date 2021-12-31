package com.example.springbooth2hibernate.controller;

import com.example.springbooth2hibernate.entity.Product;
import com.example.springbooth2hibernate.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produces")
public class ProductController {

  @Autowired
  ProductService service;

  @GetMapping("{id}")
  public ResponseEntity<Product> getById(@PathVariable Long id){
    return new ResponseEntity<Product>(service.getById(id), HttpStatus.OK);
  }
  @GetMapping
  public ResponseEntity<List<Product>> getAllProduct(){
   return ResponseEntity.ok().body(service.getAllProduct());
  }

  @PostMapping
  public ResponseEntity<Product>  createProdut(@RequestBody Product product){
    return ResponseEntity.ok().body(service.createProdut(product));
  }

  @PutMapping("{id}")
  public ResponseEntity<Product>  updateProduct(@PathVariable Long id,@RequestBody Product product){
    return new ResponseEntity<Product>( service.updateProduct(id,product),HttpStatus.OK);
  }

  @DeleteMapping("{id}")
  HttpStatus deleteProduct(@PathVariable  Long id){
     service.deleteProduct(id);
    return HttpStatus.OK;
  }
}
