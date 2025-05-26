package Festival;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Festival bombastic = new Festival("Bombastic");

        Integrante integrante1 = new Integrante("Hugo", "Guitarra", 2006);
        Integrante integrante2 = new Integrante("Mateo", "Bandurria", 2006);
        Integrante integrante3 = new Integrante("Carlos", "Xilofono", 2006);

        Grupo grupo = new Grupo("Grupo1", "Pop", "España");
        grupo.addIntegrante(integrante1);
        grupo.addIntegrante(integrante2);
        grupo.addIntegrante(integrante3);

        Escenario escenarioNorte = new Escenario(1, "Norte", 123);

        Concierto primerConcierto = new Concierto(LocalDate.of(2025, 6, 11), grupo, escenarioNorte);
        bombastic.addConcierto(primerConcierto);

        System.out.println("Concierto programado: ");
        System.out.println(primerConcierto);
    }
}
