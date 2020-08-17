package com.vfxware.springMVCLearning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
    @RequestMapping("")
    public String index(ModelMap model){
        model.addAttribute("message", "This is index page");
        return "index";
    }
}
