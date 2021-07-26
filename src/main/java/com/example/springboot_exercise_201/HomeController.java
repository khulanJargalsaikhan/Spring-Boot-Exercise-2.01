package com.example.springboot_exercise_201;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String emailFormPage(){
        return "emailtemplate";
    }

    @RequestMapping("/processform")
    public String loadEmailPage(@RequestParam("email") String email, Model model){
        model.addAttribute("emailval", email);
        return "confirm";
    }
}
