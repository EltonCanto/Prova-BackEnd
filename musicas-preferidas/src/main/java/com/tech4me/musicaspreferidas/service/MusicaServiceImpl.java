package com.tech4me.musicaspreferidas.service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tech4me.musicaspreferidas.model.Musica;
import com.tech4me.musicaspreferidas.repository.MusicaRepository;
import com.tech4me.musicaspreferidas.shared.MusicaDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaServiceImpl implements MusicaService{

    @Autowired
    MusicaRepository repositorioMusica;

    @Override
    public List<MusicaDTO> obterTodos() {
        
        List<Musica> musicas = repositorioMusica.findAll();
        
        ModelMapper mapper = new ModelMapper();

        return musicas.stream()
        .map(musica -> mapper.map(musica, MusicaDTO.class))
        .collect(Collectors.toList());

    }

    @Override
    public Optional<MusicaDTO> obterPorId(String idMusica) {

        Optional<Musica> optionalMusica = repositorioMusica.findById(idMusica);

        if (optionalMusica.isEmpty()){
            throw new InputMismatchException("Não foi encontrado a música com id: " + idMusica);
        }

        MusicaDTO musicaDTO = new ModelMapper().map(optionalMusica.get(), MusicaDTO.class);

        return Optional.of(musicaDTO);
    }

    @Override
    public MusicaDTO adicionar(MusicaDTO musicaDTO) {

        ModelMapper mapper = new ModelMapper();

        Musica musica = mapper.map(musicaDTO, Musica.class);

        musica.setId(null);

        musica = repositorioMusica.save(musica);

        return mapper.map(musica, MusicaDTO.class);

    }

    @Override
    public void delete(String idMusica) {

        repositorioMusica.deleteById(idMusica);

    }

    @Override
    public MusicaDTO atualizar(String id, MusicaDTO musicaDTO) {
        musicaDTO.setId(id);

        Musica musica = new ModelMapper().map(musicaDTO, Musica.class);
        repositorioMusica.save(musica);
        
        return musicaDTO;

    }   
}
