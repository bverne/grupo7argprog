import java.util.ArrayList;

public class Listas {
    private ArrayList<Partido> listaPartidos;

    public Listas(){
        listaPartidos =  new ArrayList<>();

    }

    public void  agregarPartido (Partido partido){
        listaPartidos.add(partido);
    }

    public int cantidadPartidos(){
        return listaPartidos.size();
    }

    public Partido recorrerlista(){
        for (Partido p: listaPartidos){
            return p;
        }
        return null;
    }

}

