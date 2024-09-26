public class Escalador extends Ciclista {
    private float aceleracionPromedioSubida;
    private float gradoRampaSoportada;

    public Escalador(int id, String nombre, float aceleracionPromedioSubida, float gradoRampaSoportada) {
        super(id, nombre);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    protected float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    protected void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    protected float getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    protected void setGradoRampaSoportada(float gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + aceleracionPromedioSubida);
        System.out.println("Velocidad promedio: " + gradoRampaSoportada);
    }

    @Override
    protected String imprimirTipo() {
        return "Es un escalador \n";
    }
}
