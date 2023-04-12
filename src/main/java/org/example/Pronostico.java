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
}
