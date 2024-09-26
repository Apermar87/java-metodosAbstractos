import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombreEquipo;
    private static int sumaTiemposCarrera;
    private String pais;
    ArrayList<Ciclista> listaCiclistas;

    public Equipo() {
        nombreEquipo = "";
        sumaTiemposCarrera = 0;
        pais = "";
    }

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        sumaTiemposCarrera = 0;
        listaCiclistas = new ArrayList<>();
    }

    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected void imprimir() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Suma de los tiempos de carrera de sus ciclistas: " + sumaTiemposCarrera + " minutos");
        System.out.println("Pais del equipo: " + pais);
    }

    protected void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    protected void calcularTotalTiempos() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.get(i);
            sumaTiemposCarrera = sumaTiemposCarrera + c.getTiempoAcumuladoCarrera();
        }
    }

    protected void ciclistasEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.get(i);
            System.out.println(c.getNombre());
        }
    }

    protected void buscarCiclista() {
        Scanner input = new Scanner(System.in);
        int identificador;

        System.out.println("Identificador de ciclista a buscar: ");
        identificador = input.nextInt();

        input.close();

        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.get(i);
            if (c.getId() == (identificador)) {
                System.out.println(c.getNombre());
            }
        }

    }

}
