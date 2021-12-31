package com.example.springbooth2hibernate.repository;

import com.example.springbooth2hibernate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
