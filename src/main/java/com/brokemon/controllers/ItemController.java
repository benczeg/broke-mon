package com.brokemon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class ItemController {
        @GetMapping("item")
        public String listItems() {
            return "item";
        }
    }
