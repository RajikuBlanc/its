package com.example.its.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controllerをつけることで、このクラスがControllerクラスだということを示すことができる
@Controller
public class indexController {
//Topでスラッグが/の場合は省略可能
//    @GetMapping("/")
    @GetMapping
    public String index(){
        return "index";
    }
}
