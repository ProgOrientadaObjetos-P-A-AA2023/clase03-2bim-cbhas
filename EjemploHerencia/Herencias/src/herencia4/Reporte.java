package herencia4;

public class Reporte {

    protected String codigo;

    public Reporte(String c) {
        codigo = c;
    }

    public void establecerCodigo(String c) {
        codigo = c;
    }

    public String obtenerCodigo() {
        return codigo;
    }
}
