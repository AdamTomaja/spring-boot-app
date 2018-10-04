package com.cydercode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ExampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }


    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        LOGGER.info("Request accepted from ip: {}", request.getRemoteAddr());
        return "Hello World - " + exampleService.convertText("spring test");
    }

}
