package com.example.demo.dao.repository;

import com.example.demo.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //public List<Product> findByname(String name);

    //public List<Product> findBydesc(String description);

    //public List<Product> findByprice(double price);

}
