import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Listas listaPartidos = new Listas();
        //lecturas l1 = new lecturas();
        //System.out.println(listaPartidos.recorrerlistaPartido());
       // System.out.println(listaPartidos.cantidadPartidos());
       // l1.ScannerPartidos(); //SOLO AGREGA EL ULTIMO PARTIDO
        Path archivoPartidos = Paths.get("partidos.txt");
        Scanner scPartido = new Scanner(archivoPartidos);
        scPartido.useLocale(Locale.forLanguageTag("es-AR"));
        Listas listaPartido = new Listas();
        scPartido.useDelimiter("[,\\n\\r]+");
        while(scPartido.hasNextInt()){
            int fecha = scPartido.nextInt();
            String equipo1 = scPartido.next();
            int golesEquipo1 = scPartido.nextInt();
            String equipo2 = scPartido.next();
            int golesEquipo2 = scPartido.nextInt();
            Partido partido = new Partido(fecha,equipo1,golesEquipo1,equipo2,golesEquipo2);
            listaPartido.agregarPartido(partido);
            System.out.println(partido);
            System.out.println("partidos guardados: " +  listaPartido.cantidadPartidos()); //esto es de prueba
            //la lista agarra el resultado pero no lo guarda y no se por qué, el lector  lee perfecto el archivo y
            // la clase partido estoy casi seguro que está bien, el error para mi esta en la clase listas
        }
        System.out.println(listaPartido.cantidadPartidos()); //Esto es de prueba


    }
}