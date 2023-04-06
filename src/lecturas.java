import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class lecturas {
    public void ScannerPartidos() throws IOException {
        Path archivoPartidos = Paths.get("partidos.txt");
        Scanner scPartido = new Scanner(archivoPartidos);
        scPartido.useLocale(Locale.forLanguageTag("es-AR"));
        Listas listaPartido = new Listas();
        scPartido.useDelimiter("[;\\n\\r]+");
        while(scPartido.hasNextInt()){

            int fecha = scPartido.nextInt();
            String equipo1 = scPartido.next();
            int golesEquipo1 = scPartido.nextInt();
            String equipo2 = scPartido.next();
            int golesEquipo2 = scPartido.nextInt();
            Partido partido = new Partido(fecha,equipo1,golesEquipo1,equipo2,golesEquipo2);
            listaPartido.agregarPartido(partido);


        }
        System.out.println(listaPartido.recorrerlistaPartido());


    }

}
