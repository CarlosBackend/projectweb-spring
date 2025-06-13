package com.carlosbackend.projectweb.repositories;

import com.carlosbackend.projectweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {

}
