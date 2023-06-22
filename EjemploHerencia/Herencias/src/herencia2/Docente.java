package herencia2;

public class Docente extends Persona {

    private double sueldo;

    public Docente(String n, String a, int e, double mat) {
        super(n, a, e);
        setSueldo(mat);
    }

    public void setSueldo(double mat) {
        sueldo = mat;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {

        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
