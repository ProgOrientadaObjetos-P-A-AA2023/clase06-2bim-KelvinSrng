package paquete03;

import static java.lang.Double.parseDouble;
import paquete01.Enlace;
import paquete02.*;

/**
 *
 * @author Jhonder
 */
public class Principal2 {
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        Auto auto = new Auto();
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};
        
        // 1. guardar en la tabla autos de la base de datos
        for (int i = 0; i < autos.length; i++){
            
            
            auto.establecerPlaca(autos[i][0]);
            auto.establecerValorMatricula(parseDouble(autos[i][1]));
            
            c.insertarAuto(auto);
        }
        
        
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }
    }
}
