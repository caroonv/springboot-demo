package com.launchcg.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {

    private static Logger logger = Logger.getLogger(RequestController.class.getName());

    @RequestMapping(value = "/hello")
    public String ping() {
        logger.debug("Inside RequestController::hello");
        return "Hello World!";
    }
}
