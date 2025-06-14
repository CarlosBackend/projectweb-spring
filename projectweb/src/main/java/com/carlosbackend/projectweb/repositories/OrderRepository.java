package com.carlosbackend.projectweb.repositories;
import com.carlosbackend.projectweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order,Long> {

}
