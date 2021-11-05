package com.app.orderapp.carts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private ProductCartRepository repository;

    @RequestMapping("/all")
    public ResponseEntity<List<ProductCart>> getCartDetails() {
        return ResponseEntity.ok(repository.findAll());
    }

}
