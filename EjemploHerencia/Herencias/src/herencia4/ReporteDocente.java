package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String codigo, ArrayList<Docente> mL) {
        super(codigo);
        lista = mL;
    }

    public void establecerPromedioSueldos() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }

        promedioSueldos = suma / lista.size();
    }

    public void miLista(ArrayList<Docente> mL) {
        lista = mL;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerMiLista() {
        return lista;
    }
    
    @Override
    public String toString() {
        String cadena = "\tReporte Docente\n";
        
        cadena = String.format("%sCÓDIGO: %s\n", cadena, codigo);
        cadena = String.format("%sLista de Docente\n", cadena);
        
        for (int i = 0; i < obtenerMiLista().size(); i++) {
            Docente d = obtenerMiLista().get(i);
            cadena = String.format("%s  > Nombre: %s - Sueldo %.1f\n", cadena, 
                    d.getNombre(), d.getSueldo());
        }
        cadena = String.format("%sEl promedio de sueldos es: %.3f", cadena, 
                promedioSueldos);
        
        return cadena;
    }

}
