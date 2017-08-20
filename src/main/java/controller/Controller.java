package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author filip_000
 */
@RestController
public class Controller {
    
    @GetMapping
    public String index(){
        return "Welcome";
    }
}
