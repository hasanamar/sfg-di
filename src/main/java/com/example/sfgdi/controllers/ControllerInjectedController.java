package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class ControllerInjectedController {

    private final GreetingService greetingService;

    public ControllerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public  String getGreetings()
    {
       return greetingService.sayGreetings();
    }
}
