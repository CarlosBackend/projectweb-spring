package com.carlosbackend.projectweb.repositories;
import com.carlosbackend.projectweb.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
