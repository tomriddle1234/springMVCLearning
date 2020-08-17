package com.vfxware.springMVCLearning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/hello")
@Controller
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hiPrintHello(ModelMap model){
        model.addAttribute("message", "Hello in Hi page");
        return "hello";
    }
}
