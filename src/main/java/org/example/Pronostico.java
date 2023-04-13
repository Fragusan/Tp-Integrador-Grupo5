package org.example;

import lombok.Data;

@Data
public class Pronostico {
    private Partido partido;
    private Resultado pronostico;

    public Pronostico(Partido partido) {
        this.partido = partido;
    }

    public void darPronostico(Resultado pronostico) {

        this.pronostico = pronostico;
    }

    public int puntos (){
        int puntos = 0;
        if(partido.resultadoPartido() == pronostico){
            return puntos = 1;
        }

        return puntos;
    }

}
