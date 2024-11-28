package com.example.users.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.users.models.Cart;
import com.example.users.repositories.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository repository;

    public List<Cart> getAllCarts() {
        return repository.findAll();
    }

    public Optional<Cart> getCartById(String id) {
        return repository.findById(id);
    }

    public Cart createCart(Cart cart) {
        return repository.save(cart);
    }

    public Cart updateCart(String id, Cart cart) {
        return repository.findById(id).map(existing -> {
            existing.setName(cart.getName());
            existing.setDescription(cart.getDescription());
            existing.setPrice(cart.getPrice());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Carrinho não encontrado"));
    }

    public void deleteCart(String id) {
        repository.deleteById(id);
    }
}
