package com.app.thym.configuration;

import com.app.thym.dao.PersonRepository;
import com.app.thym.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @PostMapping("/update")
    public String showFormForUpdate(@RequestParam("PersonId") int theId,
                                    Model theModel) {

        // get the employee from the service
        Optional<Person> person4= personrepo.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("person", person4);

        // send over to our form
        return "createperson";
    }

    @PostMapping(value="/delete")
    public String deleteperson(@RequestParam("PersonId1") int theId){
        personrepo.deleteById(theId);
        return "redirect:/list";
    }


}
