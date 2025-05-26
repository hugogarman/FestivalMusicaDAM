package Festival;

import java.util.ArrayList;

public class Escenario {
    private int codigo;
    private String nombre;
    private int capacidadMaxima;
    private ArrayList<Grupo> grupos;

    public Escenario(int codigo, String nombre, int capacidadMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.grupos = new ArrayList<>();
    }

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Escenario{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", grupos=" + getGrupos() +
                '}';
    }
}
