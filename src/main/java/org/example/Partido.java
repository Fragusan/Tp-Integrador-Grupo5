package org.example;

import lombok.Data;

@Data
public class Partido {

    private Equipo equipo1 , equipo2;
    private int golesEquipo1 , golesEquipo2;
    private Resultado resultado;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 =0;
        this.golesEquipo2=0;
    }
    public int agregarGolEquipo1(){
        return golesEquipo1 ++;
    };
    public int agregarGolEquipo2(){
        return golesEquipo2 ++;
    };

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
