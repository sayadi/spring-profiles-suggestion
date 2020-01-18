package io.sayadi.springprofilessuggestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final Environment environment;

    @Autowired
    public PropertyController(
            Environment environment) {

        this.environment = environment;
    }

    @GetMapping
    public String getProperty(@NotNull String key) {

        return environment.getProperty(key);
    }
}
