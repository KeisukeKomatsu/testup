package com.example.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BalanceController {

    private int balance = 0; // 初期残高は0

    @PostMapping("/balance/deposit")
    public String deposit(@RequestParam("depositAmount") int depositAmount, Model model) {
        balance += depositAmount; // 入金額を残高に加える
        model.addAttribute("balance", balance); // 残高をモデルに追加
        return "balance"; // 残高表示ページへリダイレクト
    }

    @PostMapping("/balance/withdraw")
    public String withdraw(@RequestParam("withdrawAmount") int withdrawAmount, Model model) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount; // 出金額を残高から差し引く
        }
        model.addAttribute("balance", balance); // 残高をモデルに追加
        return "balance"; // 残高表示ページへリダイレクト
    }
}
