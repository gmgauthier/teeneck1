package com.gmgauthier.dbdemo.controller;

import com.gmgauthier.dbdemo.model.City;
import com.gmgauthier.dbdemo.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/cities")
    public String findCities(Model model) {
        var cities = (List<City>) cityService.findAll(); // what in the world is this?
        model.addAttribute("cities", cities);
        return "showCities";
    }
}