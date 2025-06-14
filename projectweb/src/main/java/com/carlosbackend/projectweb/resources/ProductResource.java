package com.carlosbackend.projectweb.resources;
import com.carlosbackend.projectweb.entities.Category;
import com.carlosbackend.projectweb.entities.Product;
import com.carlosbackend.projectweb.service.CategoryService;
import com.carlosbackend.projectweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
