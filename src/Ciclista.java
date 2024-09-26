public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempoAcumuladoCarrera = 0;

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumuladoCarrera() {
        return tiempoAcumuladoCarrera;
    }

    protected void setTiempoAcumuladoCarrera(int tiempoAcumuladoCarrera) {
        this.tiempoAcumuladoCarrera = tiempoAcumuladoCarrera;
    }

    protected void imprimir() {
        System.out.println("Identificador: " + id);
        System.out.println("Nombre del ciclista: " + nombre);
        System.out.println("Tiempo acumulado de carrera: " + tiempoAcumuladoCarrera);
    }

    protected abstract String imprimirTipo();

}
