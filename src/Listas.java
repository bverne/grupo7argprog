import java.util.HashMap;

public class Listas {
    private HashMap<Integer,Partido> listaPartidos;

    public Listas(){
        listaPartidos =  new HashMap<>();

    }

    public void  agregarPartido (Partido partido){
        listaPartidos.put(partido.getFecha(),partido);
    }



    public int cantidadPartidos(){
        return listaPartidos.size();
    }

    public Partido recorrerlistaPartido(){
        for (Partido p: listaPartidos.values()){
            return p;
        }
        return null;
    }




}

