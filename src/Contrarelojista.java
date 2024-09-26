public class Contrarelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + velocidadMaxima);
    }

    @Override
    protected String imprimirTipo() {
        return "Es un contrarelojista \n";
    }

}
