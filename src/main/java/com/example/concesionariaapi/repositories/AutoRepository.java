package com.example.concesionariaapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.concesionariaapi.models.AutoModel;

@Repository
public interface AutoRepository extends CrudRepository<AutoModel, Long> {
    
}
