package Festival;

import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private String genero;
    private String pais;
    private ArrayList<Integrante> integrantes;

    public Grupo(String nombre, String genero, String pais) {
        this.nombre = nombre;
        this.genero = genero;
        this.pais = pais;
        this.integrantes = new ArrayList<>();
    }

    public void addIntegrante(Integrante integrante) {
        integrantes.add(integrante);
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pais='" + pais + '\'' +
                ", integrantes=" + getIntegrantes() +
                '}';
    }
}
