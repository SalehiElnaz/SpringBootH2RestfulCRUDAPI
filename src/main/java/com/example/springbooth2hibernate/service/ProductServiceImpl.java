package com.example.springbooth2hibernate.service;

import com.example.springbooth2hibernate.entity.Product;
import com.example.springbooth2hibernate.exception.ResourceNotFoundException;
import com.example.springbooth2hibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository repository;

  @Override
  public Product getById(Long id) {
    return repository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Product is not exist by id :"+id));
  }

  @Override
  public List<Product> getAllProduct() {
    return repository.findAll();
  }

  @Override
  public Product createProdut(Product product) {
    return repository.save(product);
  }

  @Override
  public Product updateProduct(Long id,Product product) {
    Product p =getById(id);
    p.setName(product.getName());
    p.setDescription(product.getDescription());
    p.setPrice(product.getPrice());
    repository.save(p);
    return p;
  }

  @Override
  public void deleteProduct(Long id) {
    Product p =getById(id);
    repository.delete(p);
  }
}
