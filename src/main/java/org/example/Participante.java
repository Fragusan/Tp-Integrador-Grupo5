/*
En el método calcularPuntaje, se recorre la lista de partidos y se compara el resultado
de cada partido con la apuesta del participante. Si el resultado coincide con la apuesta,
se suman 3 puntos al puntaje del participante. Si el resultado es empate y la apuesta es
empate, se suman 1 punto al puntaje.
*/
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