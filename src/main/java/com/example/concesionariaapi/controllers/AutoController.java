package com.example.concesionariaapi.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.concesionariaapi.services.AutoService;
import com.example.concesionariaapi.models.AutoModel;

@RestController
@RequestMapping("/auto")
public class AutoController {
    @Autowired
    AutoService autoService;

    @GetMapping()
    public ArrayList<AutoModel> obtenerAutos(){
        return autoService.obtenerAutos();
    }


    @PostMapping()
    public AutoModel guardarAuto(@RequestBody AutoModel auto){
        return this.autoService.guardarUsuario(auto);
    }
}
