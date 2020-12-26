package com.hellouniverse.anupam.hii;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellouniverseController {

	@RequestMapping("/hello")
    public String hello() {
        return "Hello To Universe Anupam";
    } 
}
