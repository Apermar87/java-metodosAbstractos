public class App {
    public static void main(String[] args) throws Exception {
        Equipo e1 = new Equipo("Once", "España");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarelojista contrarelojista1 = new Contrarelojista(123981, "Jonathan Castroviejo", 120);

        velocista1.imprimir();
        System.out.println(velocista1.imprimirTipo());

        escalador1.imprimir();
        System.out.println(escalador1.imprimirTipo());

        contrarelojista1.imprimir();
        System.out.println(escalador1.imprimirTipo());

       e1.añadirCiclista(velocista1);
        e1.añadirCiclista(escalador1);
        e1.añadirCiclista(contrarelojista1);

        velocista1.setTiempoAcumuladoCarrera(365);
        escalador1.setTiempoAcumuladoCarrera(385);
        contrarelojista1.setTiempoAcumuladoCarrera(370);

        e1.calcularTotalTiempos();
        e1.imprimir();
        e1.ciclistasEquipo();
        e1.buscarCiclista();
    }
}
