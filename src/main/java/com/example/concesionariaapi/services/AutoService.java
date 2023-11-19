package com.example.concesionariaapi.services;

import java.util.ArrayList;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.concesionariaapi.repositories.AutoRepository;
import com.example.concesionariaapi.models.AutoModel;

@Service
public class AutoService {
    @Autowired
    AutoRepository autoRepository;

    public ArrayList<AutoModel> obtenerAutos(){
    return( ArrayList<AutoModel>) autoRepository.findAll();

    }


    public AutoModel guardarUsuario( AutoModel auto){
        return  autoRepository.save(auto);
    }
}
