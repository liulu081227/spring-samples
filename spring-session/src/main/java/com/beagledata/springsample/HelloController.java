package com.beagledata.springsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by lulu on 2017/10/10.
 */
@RestController
public class HelloController {
    @PostMapping("hello/{name}")
    public void postHello(@PathVariable String name, HttpSession session) {
        session.setAttribute("name", name);
    }

    @GetMapping("hello")
    public String getHello(HttpSession session) {
        return "hello " + session.getAttribute("name");
    }
}
