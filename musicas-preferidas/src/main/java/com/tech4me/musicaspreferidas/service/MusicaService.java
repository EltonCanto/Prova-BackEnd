package com.tech4me.musicaspreferidas.service;

import java.util.List;
import java.util.Optional;
import com.tech4me.musicaspreferidas.shared.MusicaDTO;

public interface MusicaService {

    List<MusicaDTO> obterTodos();

    Optional<MusicaDTO> obterPorId(String idMusica);

    MusicaDTO adicionar(MusicaDTO musicaDTO);

    MusicaDTO atualizar(String id, MusicaDTO musicaDTO);

    void delete(String idMusica);
    
}
