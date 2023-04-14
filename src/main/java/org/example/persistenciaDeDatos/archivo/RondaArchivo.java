package org.example.persistenciaDeDatos.archivo;

import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
@Data
public class RondaArchivo {
    private List<String> archivoResultado=new ArrayList<>();

    public RondaArchivo(String ruta) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(ruta));
        for (int j = 1; j < allLines.size(); j++) {
            this.archivoResultado.add(allLines.get(j));
          }
    }
}


