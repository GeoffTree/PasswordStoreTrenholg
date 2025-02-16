package ca.sheridancollege.trenholg.passwordstoretrenholg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping("/")
    public String index() { return "index"; }

    @GetMapping("/view")
    public String view() { return "viewPasswordRecord"; }

    @GetMapping("/search")
    public String search() { return "searchPasswordRecord"; }


}
