package com.ehealth.dondusang.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paquetController {
    @GetMapping("/sang")
    public String stock(){
        return "stock";
    }
}
