package com.app.thym.configuration;

import com.app.thym.dao.PersonRepository;
import com.app.thym.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class config {

    @Autowired
    private PersonRepository personrepo;

    @RequestMapping(value = "/")
    public String mainMenu(/*Model model*/) {
        //model.addAttribute("som" , "Jyst ike thar");
        return "main-menu";
    }

    // show the table
    @GetMapping(value = "/list")
    public String list1(Model model1) {
        List<Person> person1 = personrepo.findAll();
        model1.addAttribute("person", person1);
        return "personpage";
    }

    @GetMapping(value = "/addlist")
    public String linktothepage(Model model2) {
    Person person2=new Person();
    model2.addAttribute("person",person2);
    return "createperson";
    }
    @PostMapping(value="/save")
    public String saveperson (@ModelAttribute("person") Person person3){
        personrepo.save(person3);
        return "redirect:/list";
    }

}
