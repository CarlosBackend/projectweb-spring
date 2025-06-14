package com.carlosbackend.projectweb.resources;
import com.carlosbackend.projectweb.entities.User;
import com.carlosbackend.projectweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserResource {
    @Autowired
    private UserService Userservice;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = Userservice.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = Userservice.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
