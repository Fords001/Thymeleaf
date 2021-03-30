package com.app.thym.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class config {

    @RequestMapping (value="/")
    public String mainMenu(/*Model model*/){
        //model.addAttribute("som" , "Jyst ike thar");
        return "main-menu";
    }
}
