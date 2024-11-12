package com.example.fistproject2.contoller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class firstContoller {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
         model.addAttribute("username", "쁘띠공주");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouAgain(Model model) {
        model.addAttribute("username", "쁘띠공주");
        return "goodbye";
    }
}