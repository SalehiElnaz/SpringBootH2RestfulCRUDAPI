package com.example.springbooth2hibernate.service;

import com.example.springbooth2hibernate.entity.Product;

import java.util.List;

public interface ProductService  {

  Product getById(Long id);
  List<Product> getAllProduct();
  Product createProdut(Product product);
  Product updateProduct(Long id,Product product);
  void deleteProduct(Long id);
}
