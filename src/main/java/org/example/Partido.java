package org.example;

import lombok.Data;

@Data
public class Partido {

    private Equipo equipo1 , equipo2;
    private int golesEquipo1 , golesEquipo2, ronda;
    private Resultado resultado;



    public Resultado resultadoPartido(){

        if(golesEquipo1 == golesEquipo2){
            resultado = Resultado.EMPATE;
        }
        else if(golesEquipo1 > golesEquipo2){
            resultado = Resultado.GANADOR_EQUIPO1;
        }
        else resultado = Resultado.GANADOR_EQUIPO2;

        return resultado;
    };


}
