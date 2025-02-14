package com.techie_microservices.product.repository;

import com.techie_microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}