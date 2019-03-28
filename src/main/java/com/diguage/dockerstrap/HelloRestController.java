package com.diguage.dockerstrap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author D瓜哥, https://www.diguage.com/
 * @since 2019-03-27 22:15
 */
@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index() {
        return "Hello D瓜哥！";
    }
}
