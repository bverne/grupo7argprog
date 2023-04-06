import java.util.ArrayList;

public class Partido {

    private ArrayList<Partido> listaPartidos;
    private String equipo1;
    private String equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    private  String empate;

    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        golesEquipo2 = golesEquipo2;
    }

    public String toString (){
        return equipo1 + " " + golesEquipo1 + " - " + equipo2  + " " +  golesEquipo2;
    }


    public String resultados (int golesEquipo1, int golesEquipo2){

        if(golesEquipo1 > golesEquipo2){
            return " el equipo  ganador es : " + equipo1
                    + " ,  y el equipo perdedor es: " + equipo2;

        }
        if (golesEquipo1 < golesEquipo2){
            return "el equipo ganador es el equipo: " + equipo2
                    + " , y el equipo perdedor es: " + equipo1;
        }
        return "hubo un empate";
    }



}


