package Festival;

public class Integrante {
    private String nombre;
    private String instrumento;
    private int anioNacimiento;

    public Integrante(String nombre, String instrumento, int anioNacimiento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", instrumento='" + instrumento + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }
}
