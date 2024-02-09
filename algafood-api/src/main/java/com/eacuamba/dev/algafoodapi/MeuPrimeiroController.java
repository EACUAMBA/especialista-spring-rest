package com.eacuamba.dev.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //this annotation tells Spring that this class is a controller and can handle some HTTP request
public class MeuPrimeiroController {

    @GetMapping("/hello") // this annotation tells Spring that this method will be invoked when a request to /hello and with method GET be made.
    @ResponseBody // this annotation tells Spring that the response should be put in the body, no view resolvers should be used.
    public String hello(){
        return "Olá!";
    }
}
