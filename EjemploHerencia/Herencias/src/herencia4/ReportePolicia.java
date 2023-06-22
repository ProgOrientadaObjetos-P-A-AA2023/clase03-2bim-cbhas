package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String codigo, ArrayList<Policia> miLista) {
        super(codigo);
        lista = miLista;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();
        }

        promedioEdades = suma / lista.size();
    }

    public void establecerLista(ArrayList<Policia> l) {
        lista = l;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "\n\tReporte Policía\n";

        cadena = String.format("%sCÓDIGO: %s\n", cadena, codigo);
        cadena = String.format("%sLista de Policías\n", cadena);

        for (int i = 0; i < obtenerLista().size(); i++) {
            Policia e = obtenerLista().get(i);
            cadena = String.format("%s  > Nombre: %s - Edad: %d\n", cadena,
                    e.getNombre(), e.getEdad());
        }
        cadena = String.format("%sEl promedio de matrículas es: %.3f", cadena,
                obtenerPromedioEdades());

        return cadena;
    }

}
