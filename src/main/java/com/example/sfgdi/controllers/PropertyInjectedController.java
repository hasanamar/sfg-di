package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService  greetingService;

    public String  getGreetings()
    {
      return greetingService.sayGreetings();
    }
}
