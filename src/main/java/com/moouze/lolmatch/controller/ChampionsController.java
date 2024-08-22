package com.moouze.lolmatch.controller;

import com.moouze.lolmatch.model.Champions;
import com.moouze.lolmatch.repository.ChampionsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/champions")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChampionsController {
    @Autowired
    private ChampionsRepository championsRepository;
    @PostMapping
    public ResponseEntity<Champions> post(@Valid @RequestBody Champions champions){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(championsRepository.save(champions));
    }
    @GetMapping
    public ResponseEntity<List<Champions>> getAll (){
        return ResponseEntity.ok(championsRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Champions> getById(@PathVariable Long id){
        return championsRepository.findById(id)
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
