import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Path partidos = Paths.get("partidos.txt");
        Scanner scPartido = new Scanner(partidos);
        Listas listaPartidos = new Listas();
        //operar con el archivo de los partidos
        scPartido.useDelimiter(",");
        while(scPartido.hasNext()){
            String equipo1 = scPartido.next();
            int golesEquipo1 = scPartido.nextInt();
            String equipo2 = scPartido.next();
            int golesEquipo2 = scPartido.nextInt();
            Partido partido = new Partido(equipo1,equipo2,golesEquipo1,golesEquipo2);
            System.out.println(partido);
            System.out.println(partido.resultados(golesEquipo1,golesEquipo2));
            listaPartidos.agregarPartido(partido);

        }
        System.out.println("la cantidad de partidos jugados fueron " + listaPartidos.cantidadPartidos());
        System.out.println("lista de partidos: " + listaPartidos.recorrerlista());






    }
}