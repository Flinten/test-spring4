package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ejer on 07-03-2018.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
