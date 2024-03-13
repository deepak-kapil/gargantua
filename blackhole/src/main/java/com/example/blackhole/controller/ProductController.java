package com.example.blackhole.controller;


import com.example.blackhole.Dto.CreateProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/")
    public String getAllProducts(){
        return  "all products";
    }


    @PostMapping("/")
    public String createProduct(@RequestBody CreateProductDto Dto){
        return  "product created" +  Dto.getProductName();
    }

    @GetMapping("/{productId}")
    public String getProductbyId(@PathVariable("productId") Integer productId){
        return  "Product id "+productId;
    }
}
