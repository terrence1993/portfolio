package com.gmail.trokhymchuk.andrii;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andrew on 3/20/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping
    public String loginPage(){
        return "enter";
    }
}
