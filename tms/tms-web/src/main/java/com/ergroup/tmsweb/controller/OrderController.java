package com.ergroup.tmsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/createorder")
    public String createOrder() {

        return "order/createorder";
    }

    @GetMapping("/hisorder")
    public String hisOrder() {

        return "order/hisorder";
    }

    @GetMapping("/order")
    public String order() {

        return "order/order";
    }
}
