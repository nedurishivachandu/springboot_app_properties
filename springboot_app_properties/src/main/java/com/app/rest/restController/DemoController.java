package com.app.rest.restController;

import com.app.rest.constant.Constant;
import com.app.rest.prop.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private AppProperties appProperties;
    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return appProperties.getMessages().get("welcomeMsg");
    }
    @GetMapping("/greet")
    public String getGreetingMsg(){
        return appProperties.getMessages().get("greetMsg");
    }
}
