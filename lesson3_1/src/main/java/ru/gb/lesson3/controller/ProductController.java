package ru.gb.lesson3.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.lesson3.sevice.ProductService;

@Controller
@RequestMapping("/product")
@Log4j2
@RequiredArgsConstructor
public class ProductController {

        private final ProductService productService;

        @GetMapping
//        @ModelAttribute("product")
        public String findAll(Model model){
                model.addAttribute("product", productService.findAll());
                return "product";
        }
 @GetMapping("/{id}")
        public String findBiyId(@PathVariable Long id, Model model){
         model.addAttribute("product", productService.findById(id));
         return "product";
 }

}
