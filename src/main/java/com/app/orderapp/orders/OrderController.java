package com.app.orderapp.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping("/all")
    public ResponseEntity<List<OrderItem>> getOrderedItems() {
        return ResponseEntity.ok(orderItemRepository.findAll());
    }
}
