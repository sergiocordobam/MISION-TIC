
package reto4;
import java.util.ArrayList;
public class Reto4 {

    
    public static Object[] reportes(ArrayList <Cliente> tienda) {
        Object[] lista = new Object[5];
        int totalClientes = 0;
        String nombreMenor = "";
        int totalMenor = 100000;
        String nombreMayor = "";
        int totalMayor = 0;
        for(int i = 0; i < tienda.size(); i++){
            
            totalClientes += tienda.get(i).getTotalApagar();
            if(tienda.get(i).getTotalApagar() < totalMenor){
                totalMenor = tienda.get(i).getTotalApagar();
                nombreMenor = tienda.get(i).getNombreCompleto();
            }
            
            if(tienda.get(i).getTotalApagar() > totalMayor){
                totalMayor = tienda.get(i).getTotalApagar();
                nombreMayor = tienda.get(i).getNombreCompleto();
            }
        }
        double promedio = totalClientes / tienda.size();
        lista[0] = promedio;
        lista[1] = nombreMenor;
        lista[2] = totalMenor;
        lista[3] = nombreMayor;
        lista[4] = totalMayor;
        return lista;
    }
    
}
