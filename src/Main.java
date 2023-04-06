import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Listas listaPartidos = new Listas();
        lecturas l1 = new lecturas();
        System.out.println(listaPartidos.recorrerlistaPartido());
        System.out.println(listaPartidos.cantidadPartidos());
        l1.ScannerPartidos(); //SOLO AGREGA EL ULTIMO PARTIDO

    }
}