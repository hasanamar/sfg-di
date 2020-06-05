package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerInjectedControllerTest {

    private  ControllerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ControllerInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());

    }
}