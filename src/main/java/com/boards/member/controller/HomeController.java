package com.boards.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    // 基本ページ要請めメソッド
    @GetMapping("/")
    public String index(){
        return "index"; // => templates フォルダの　index.htmlを探す

    }

}
