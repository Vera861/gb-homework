package ru.gb.lesson3.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.lesson3.model.Product;
import ru.gb.lesson3.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

        private final ProductRepository productRepository;

        @GetMapping
        @ModelAttribute("product")
        public List<Product> findAll(){
                return productRepository.findAll();
        }

}
