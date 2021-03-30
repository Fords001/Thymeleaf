package com.app.thym.configuration;

import com.app.thym.dao.PersonRepository;
import com.app.thym.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class config {

    @Autowired
    private PersonRepository personrepo;

    @RequestMapping (value="/")
    public String mainMenu(/*Model model*/){
        //model.addAttribute("som" , "Jyst ike thar");
        return "main-menu";
    }
// show the table
    @GetMapping(value="/list")
    public String list1(Model model1){
        List<Person> person1=personrepo.findAll();
        model1.addAttribute("person",person1);
        return "personpage";

    }
}
