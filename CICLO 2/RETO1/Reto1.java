
package reto1;
import java.util.Arrays;

public class Reto1 {
    public static void main(String[] args) {
        int [] compra1 = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        System.out.println(Arrays.toString(reporte(compra1)));
    }
    
    public static int [] reporte (int [] compra){
        int costo_total = 0;
        int caro = compra[0];
        int barato = compra[0];
        
        for(int i = 0; i <= compra.length - 1; i++){
            costo_total += compra[i];
            if(compra[i] < barato){
                barato = compra[i];
            }

            if(compra[i] > caro){
                caro = compra[i];
            }
        }

        int [] datos = {costo_total, barato, caro};
        return datos;
    }
}
