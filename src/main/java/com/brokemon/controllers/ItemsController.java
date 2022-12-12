package com.brokemon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class ItemsController {
        @GetMapping("items")
        public String listItems() {
            return "items";
        }
    }
