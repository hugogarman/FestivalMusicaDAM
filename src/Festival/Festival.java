package Festival;

import java.util.ArrayList;

public class Festival {
    private String nombre;
    private ArrayList<Concierto> conciertos;

    public Festival(String nombre) {
        this.nombre = nombre;
        this.conciertos = new ArrayList<>();
    }

    public void addConcierto(Concierto concierto) {
        conciertos.add(concierto);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Concierto> getConciertos() {
        return conciertos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConciertos(ArrayList<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "nombre='" + nombre + '\'' +
                ", conciertos=" + getConciertos() +
                '}';
    }
}
