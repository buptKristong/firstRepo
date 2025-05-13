package com.ht.test.projecthet.controller;
import com.ht.test.projecthet.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * TeatController is a Spring MVC controller that handles HTTP requests.
 * It is annotated with @RestController, which indicates that it is a controller
 * where every method returns a domain object instead of a view.
 */
@Controller
@RequestMapping("rest/user")
public class TeatController {
    @Autowired
    TestService testService;
    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return testService.performTest();
    }
}
