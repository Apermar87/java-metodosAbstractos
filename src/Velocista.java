public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio);
        System.out.println("Velocidad promedio: " + velocidadPromedio);
    }

    @Override
    protected String imprimirTipo() {
        return "Es un velocista \n";
    }

}
