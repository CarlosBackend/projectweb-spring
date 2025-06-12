package com.carlosbackend.projectweb.resources;


import com.carlosbackend.projectweb.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User("Maria","maria@email","123456");
        return ResponseEntity.ok().body(user);
    }
}
