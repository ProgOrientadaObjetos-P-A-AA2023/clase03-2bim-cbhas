package paquete01;

public abstract class Docente {

    private String nombre;

    public Docente(String n) {
        nombre = n;
    }

    public void establecerDocente(String n) {
        nombre = n;
    }

    public String obtenerDocente() {
        return nombre;
    }
}
