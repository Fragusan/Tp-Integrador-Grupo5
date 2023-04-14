package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Participante {
    private  String nombre;
    private int puntos ;
    private List<Pronostico> pronosticoParticipante;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

      /* pronosticoParticipante = new ArrayList<>();
        for (Pronostico p : pronosticoParticipante) {

            this.puntos += p.puntos();
        }*/

}
