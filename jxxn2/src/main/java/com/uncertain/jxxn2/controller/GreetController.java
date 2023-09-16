package com.uncertain.jxxn2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping("/Greet")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "Jxxn");
        return "Greet"; //templates/Greet.mustache => 브라우저로 전송!
    }
    @GetMapping("/bye")
    public String byeUser(Model model) {
        model.addAttribute("user", "Jxxn");
        return "Bye";
    }
}
