package com.springexamples.mvc.home;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Home page controller. It has methods which are invoked by user
 * interactions on home page.
 */
@Controller
public class HomepageController {

    @GetMapping("/")
    public String welcome(Locale locale, Model model) {
        return "home";
    }

}
