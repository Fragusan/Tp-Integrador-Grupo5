package org.example;

import lombok.Data;

import java.util.List;
@Data
public class Participante {
    private  String nombre;
    private int puntaje ;
    private Resultado apuesta;
    private List<Pronostico> pronosticoParticipante;

	public int calcularPuntaje(List<Partido> partidos) {
        int puntaje = 0;
        for (Partido partido : partidos) {
            if (partido.getResultado() == this.apuesta) {
                puntaje += 3;
            } else if (partido.getResultado() == Resultado.EMPATE && this.apuesta == Resultado.EMPATE) {
                puntaje += 1;
            }
        }
        return puntaje;
    }

      /* pronosticoParticipante = new ArrayList<>();
        for (Pronostico p : pronosticoParticipante) {

            this.puntos += p.puntos();
        }*/

}