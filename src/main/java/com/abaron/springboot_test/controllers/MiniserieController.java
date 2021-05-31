package com.abaron.springboot_test.controllers;

import com.abaron.springboot_test.models.BaseDto;
import com.abaron.springboot_test.services.miniserieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/miniserie")
public class MiniserieController {

    miniserieService miniserieService;

    public MiniserieController(miniserieService miniserieService) {
        this.miniserieService = miniserieService;
    }

    @PostMapping
    public ResponseEntity<?> saveMiniserie(@RequestBody BaseDto p){
        return ResponseEntity.ok().body(miniserieService.putValue(p.getId(),p.getValue()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> followersCount(@PathVariable Integer id){
        return new ResponseEntity(miniserieService.getValue(id), HttpStatus.OK);
    }
    @GetMapping("/")
    public String follow(){
        return "hola";
    }



}
