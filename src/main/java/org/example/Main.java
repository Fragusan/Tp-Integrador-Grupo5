package org.example;


import org.example.persistenciaDeDatos.archivo.ParticipanteArchivo;
import org.example.persistenciaDeDatos.archivo.RondaArchivo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        RondaArchivo archi=new RondaArchivo(args[0]);
        List <Partido> partidos=new ArrayList<>();
        ParticipanteArchivo arch=new ParticipanteArchivo(args[1]);
        List<Participante> participantes=new ArrayList<>();


        for (String elementos:archi.getArchivoResultado()) {
            String[] elementosRonda = elementos.split(",");

            try {
                if (elementosRonda.length != 5) {
                    throw new Exception("El archivo no tiene la cantidad de elementos correcta. ");
                } else {
                    Equipo equipo1 = new Equipo(elementosRonda[1]);
                    Equipo equipo2 = new Equipo(elementosRonda[4]);

                    Partido partido = new Partido();
                    partido.setRonda(Integer.parseInt(elementosRonda[0]));
                    partido.setEquipo1(equipo1);
                    partido.setEquipo2(equipo2);
                    partido.setGolesEquipo1(Integer.parseInt(elementosRonda[2]));
                    partido.setGolesEquipo2(Integer.parseInt(elementosRonda[3]));
                    partido.setResultado(partido.resultadoPartido());

                    partidos.add(partido);
                }
            } catch (NumberFormatException e) {
                System.out.println("El valor del dato de los goles no es un número entero. ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (String elementos:arch.getArchivoApuestas()){
            Participante persona=new Participante();
            String []nombre = elementos.split(",");
            persona.setNombre(nombre[0]);
            int X = elementos.indexOf("X");
            if (elementos.charAt(X - 3) == ',') {
                persona.setApuesta(Resultado.GANADOR_EQUIPO2);
            }else{
                if (elementos.charAt(X - 2) == ',') {
                    persona.setApuesta(Resultado.EMPATE);
                }else{
                    persona.setApuesta(Resultado.GANADOR_EQUIPO1);
                }
            }
            participantes.add(persona);
        }
       // System.out.println(participantes);

       /* for (Participante a:participantes){
             String aux=a.getNombre();
             if(aux.equals(a.getNombre())){

             }
        }*/

        /*
        sacar dao
        calculo de puntaje tiene que tener en cuenta las rondas.. entrega 2
        calculo de puntaje es por persona

        main
        unalista de rondas cada ronado con sus partidos

        una lista de participante cada uno con su pronostico.

        hacer un metodo por fuera del main para comparar que pida como parametro un participante
        y las lista de las rondas y con eso calcular el puntaje de la persona sabiendo que si la persona acerto a todo
        tiene un punto mas..
        este metodo debe ser testeado.

        /
         */
    }
}