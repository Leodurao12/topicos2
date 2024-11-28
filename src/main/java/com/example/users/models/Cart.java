package com.example.users.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "carts")
@Data
public class Cart {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;

    // Getters and Setters
}
