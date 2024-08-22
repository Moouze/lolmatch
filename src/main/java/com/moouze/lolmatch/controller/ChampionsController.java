package com.moouze.lolmatch.controller;

import com.moouze.lolmatch.repository.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/champions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChampionsController {
    @Autowired
    private ChampionsRepository championsRepository;


}
