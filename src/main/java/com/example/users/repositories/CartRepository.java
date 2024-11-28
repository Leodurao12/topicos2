package com.example.users.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.models.Cart;


public interface CartRepository extends MongoRepository<Cart, String> {
}
