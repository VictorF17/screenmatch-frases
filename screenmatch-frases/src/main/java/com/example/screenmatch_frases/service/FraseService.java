package com.example.screenmatch_frases;

import com.example.screenmatch_frases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraeAleatoria() {
         Frase frase = repositorio.buscaFraseAleatoria();
         return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}