package com.brenA.demojwt.myAI.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenA.demojwt.myAI.entities.OnlyInfinitiveVerb;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/aiverbs/")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping("/{onlyVerb}")
    public String welcome(OnlyInfinitiveVerb onlyInfinitiveVerb) {
        return "The ";
    }
}
