package com.example.springbooth2hibernate.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
@Data
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id ;

  @Column
  private String name;
  private String description;
  private BigDecimal price;

  @CreationTimestamp
  private Date createdAt;

  @CreationTimestamp
  private Date updatedAt;

}
