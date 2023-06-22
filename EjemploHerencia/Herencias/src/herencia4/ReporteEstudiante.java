package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String codigo, ArrayList<Estudiante> miLista) {
        super(codigo);
        lista = miLista;
    }

    public void establecerPromedioMatriculas() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }

        promedioMatriculas = suma / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "\n\tReporte Estudiante\n";

        cadena = String.format("%sCÓDIGO: %s\n", cadena, codigo);
        cadena = String.format("%sLista de Estudiantes\n", cadena);

        for (int i = 0; i < obtenerLista().size(); i++) {
            Estudiante e = obtenerLista().get(i);
            cadena = String.format("%s  > Nombre: %s - Matrícula %.1f\n", cadena,
                    e.getNombre(), e.getMatricula());
        }
        cadena = String.format("%sEl promedio de matrículas es: %.3f", cadena,
                obtenerPromedioMatriculas());

        return cadena;
    }

}
