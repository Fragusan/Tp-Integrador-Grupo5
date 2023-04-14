package org.example;

import lombok.Data;

import java.util.List;
@Data
public class Participante {
    private  String nombre;
    private int puntos ;
    private Resultado apuesta;
    private List<Pronostico> pronosticoParticipante;


      /* pronosticoParticipante = new ArrayList<>();
        for (Pronostico p : pronosticoParticipante) {

            this.puntos += p.puntos();
        }*/

}
