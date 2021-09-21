package com.tech4me.musicaspreferidas.shared;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MusicaDTO {

    private String id;

    @NotBlank(message =  "O título deve possuir caracteres não brancos")
    @NotEmpty(message = "O título deve ser preenchido")
    @Size(min = 3, message = "O título deve ter no mínimo 3 caracteres")
    private String titulo;

    @NotBlank(message =  "O nome do artista deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome do artista deve ser preenchido")
    @Size(min = 3, message = "O nome do artista deve ter no mínimo 3 caracteres")   
    private String artista;

    @NotBlank(message =  "O nome do album deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome do album deve ser preenchido")
    @Size(min = 3, message = "O nome do album deve ter no mínimo 3 caracteres")     
    private String album;

    @NotBlank(message =  "O genero deve possuir caracteres não brancos")
    @NotEmpty(message = "O genero deve ser preenchido")
    @Size(min = 3, message = "O genero deve ter no mínimo 3 caracteres")
    private String genero;

    @NotBlank(message =  "O ano de lançamento deve possuir caracteres não brancos")
    @NotEmpty(message = "O ano de lançamento deve ser preenchido")
    @Size(min = 4, max = 4, message = "O ano de lançamento deve ter 4 caracteres")
    private String anoLancamento;

    @NotBlank(message =  "O nome do compositor deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome do compositor deve ser preenchido")
    @Size(min = 3, message = "O nome do compositor deve ter no mínimo 3 caracteres")
    private String compositor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

}
