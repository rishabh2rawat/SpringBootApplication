package com.rishabh.testproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BDM2")
public class FirstSpringController {

    @GetMapping("/getName")
    public String first()
    {
        return "Rishabh first spring api :-)";
    }


}
