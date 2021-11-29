package com.example.apirapidos.apirapidos.repositories;

import com.example.apirapidos.apirapidos.models.Potato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotatosRepository extends CrudRepository<Potato, Long> {


}
