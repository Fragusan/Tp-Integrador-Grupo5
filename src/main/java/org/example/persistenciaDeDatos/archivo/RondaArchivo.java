package org.example.persistenciaDeDatos.archivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RondaArchivo {
    public RondaArchivo() throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get(".\\resultados.csv"));
        for (int j = 1; j < allLines.size(); j++) {
            String archivoResultado = allLines.get(j);
            String[] elementosRes = archivoResultado.split(",");

        /*    Equipo equipo1 = new Equipo();
            equipo1.setNombre(elementosRes[1]);
            Equipo equipo2 = new Equipo();
            equipo2.setNombre(elementosRes[4]);

            Partido partido = new Partido();
            partido.setRonda(Integer.parseInt(elementosRes[0]));
            partido.setEquipo1(equipo1);
            partido.setEquipo2(equipo2);
            partido.setGolesEquipo1(Integer.parseInt(elementosRes[2]));
            partido.setGolesEquipo2(Integer.parseInt(elementosRes[3]));

            partidos.add(partido); */
    }
    }




}


