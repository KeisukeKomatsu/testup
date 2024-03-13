package com.example.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
    
    @GetMapping("/deposit")
    public String depositPage() {
        return "deposit"; // 入金用ページへの遷移
    }
    
    @GetMapping("/withdraw")
    public String withdrawPage() {
        return "withdraw"; // 出金用ページへの遷移
    }
}
