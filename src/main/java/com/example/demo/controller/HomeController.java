package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("")
public String getHomePage()
{
return "index";	
}
@RequestMapping("bonjour")
public String morning(Model m)
{
m.addAttribute("message", " ceci est un message dynamique.");
return "bonjour";
}
}
