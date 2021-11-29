package com.example.apirapidos.apirapidos.services;

import com.example.apirapidos.apirapidos.models.Potato;
import com.example.apirapidos.apirapidos.repositories.PotatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PotatosService {

    @Autowired
    private PotatosRepository repository;

    public Iterable<Potato> findAllPotatos() {
        return repository.findAll();
    }

    public void save(Potato potato) {
        repository.save(potato);
    }
}
