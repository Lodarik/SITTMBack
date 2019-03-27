package ru.itmonopoly.SITTM.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SITTMMVCController  {
@GetMapping ("/")
public String index(Model model) {
	model.addAttribute("message", "Dmitry");
	return "index";
}

}
