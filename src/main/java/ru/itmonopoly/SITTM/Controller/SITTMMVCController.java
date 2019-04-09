package ru.itmonopoly.SITTM.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SITTMMVCController {
    @GetMapping(value={"/", "/index"})
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "index";
        
    }
    @PostMapping(value= {"/","/index"})
    public String postindex(Model model, @RequestParam(value = "user") String user) {
    	model.addAttribute("user",user);
    	return "user";
    	
    }
    
}