package Festival;

import java.time.LocalDate;

public class Concierto {
    private LocalDate fecha;
    private Grupo grupoAsignado;
    private Escenario escenario;

    public Concierto(LocalDate fecha, Grupo grupoAsignado, Escenario escenario) {
        this.fecha = fecha;
        this.grupoAsignado = grupoAsignado;
        this.escenario = escenario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Grupo getGrupoAsignado() {
        return grupoAsignado;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setGrupoAsignado(Grupo grupoAsignado) {
        this.grupoAsignado = grupoAsignado;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "fecha=" + fecha +
                ", grupoAsignado=" + grupoAsignado +
                ", escenario=" + escenario +
                '}';
    }
}
