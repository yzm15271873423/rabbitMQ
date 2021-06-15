package com.yzm.controller;

import com.yzm.bean.Product;
import com.yzm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 19:27
 */

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public String show(){
        return "add";
    }

    @PostMapping("/add")
    public String add(Product product){
        int index = productService.insertProduct(product);
        System.out.println("index:"+index);

        return "add";
    }

}
