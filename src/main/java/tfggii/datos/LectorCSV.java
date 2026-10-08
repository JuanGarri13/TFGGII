package tfggii.datos;

import com.opencsv.CSVReader;
import tfggii.modelo.Cotizacion;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    public static List<Cotizacion> procesarArchivo(String rutaArchivo) {
        List<Cotizacion> cotizaciones = new ArrayList<>();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        try (CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
            reader.readNext(); 

            String[] fila;
            while ((fila = reader.readNext()) != null) {
                Cotizacion c = new Cotizacion();
                
                String fechaSinHora = fila[0].split(" ")[0]; 
                
                c.setFecha(LocalDate.parse(fechaSinHora, formatter));
                c.setPrecioApertura(Double.parseDouble(fila[1]));
                c.setMaximo(Double.parseDouble(fila[2]));
                c.setMinimo(Double.parseDouble(fila[3]));
                c.setPrecioCierre(Double.parseDouble(fila[4]));
                c.setVolumen(Double.parseDouble(fila[5]));
                
                cotizaciones.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error leyendo el CSV: " + e.getMessage());
        }

        return cotizaciones;
    }
}