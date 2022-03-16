package com.JavaConfiguration.contact.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.JavaConfiguration.contact.domain.Contact;
import com.JavaConfiguration.contact.service.ContactService;
 
@Controller
public class ContactController {
    @Autowired
    private ContactService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Contact> listcontact = service.listAll();
        model.addAttribute("listcontact", listcontact);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("Contact", new Contact());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute("Contact") Contact std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{contactId}")
    public ModelAndView showEditContactPage(@PathVariable(name = "contactId") int contactId) {
        ModelAndView mav = new ModelAndView("new");
        Contact std = service.get(contactId);
        mav.addObject("Contact", std);
        return mav;
        
    }
    @RequestMapping("/delete/{contactId}")
    public String deletecontact(@PathVariable(name = "contactId") int contactId) {
        service.delete(contactId);
        return "redirect:/";
    }
}
