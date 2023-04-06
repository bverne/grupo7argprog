import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public  void  Pronostico() throws IOException {
        Path pronosticoPersona = Paths.get("ejemplo.txt");
        Scanner scPronostico =  new Scanner(pronosticoPersona);
        while(scPronostico.hasNext()){
            //opero con el archivo, seguramente algo parecido a como se opera en el main con los partidos
        }


    }


}
