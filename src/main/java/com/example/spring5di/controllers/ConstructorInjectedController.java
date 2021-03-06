package com.example.spring5di.controllers;

import com.example.spring5di.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/* Created by arankhri on 04-05-2020 */
@Controller
public class ConstructorInjectedController {

    private final StockService stockService;

    public ConstructorInjectedController(StockService stockService) {
        this.stockService = stockService;
    }
    public String getQuote(){
        return stockService.getQuote();
    }
}
