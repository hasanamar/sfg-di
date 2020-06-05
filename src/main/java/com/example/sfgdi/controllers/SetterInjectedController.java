package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  getGreetings()
    {
        return greetingService.sayGreetings();
    }
}
