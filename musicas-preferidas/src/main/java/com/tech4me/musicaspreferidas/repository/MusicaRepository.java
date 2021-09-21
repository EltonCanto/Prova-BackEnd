package com.tech4me.musicaspreferidas.repository;

import com.tech4me.musicaspreferidas.model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends MongoRepository<Musica, String>{
    
}
