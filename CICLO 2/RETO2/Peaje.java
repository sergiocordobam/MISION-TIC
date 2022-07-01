package peaje;
import java.util.Arrays;
public class Peaje {

    public static void main(String[] args) {
        String [] filaCoches = {"FNC901", "RBP250", "TPS706", "ITN503", 
            "RSP845", "SBL560", "IVD432", "LCS254", "ECT243", "RPL122", 
            "FRS484", "TLB884", "NFT948", "INS230"};
        
        Peajeaux p1 = new Peajeaux(filaCoches);
        p1.proximoCoche();
        p1.proximoCoche();
        p1.proximoCoche();
        p1.proximoCoche();
        
        p1.agregarCocheFlyPass();
        p1.proximoCoche();
        p1.agregarCocheFlyPass();
        p1.proximoCoche();
        p1.agregarCocheFlyPass();
        
        p1.cambiarEstadoPeaje();
        p1.cambiarEstadoPeaje();
        p1.proximoCoche();
        p1.agregarCocheFlyPass();
        
        System.out.print("Fila de coches: ");
        System.out.println(Arrays.toString(p1.getFilaCoches()));
        
        System.out.print("Coches con FlyPass: ");
        System.out.println(Arrays.toString(p1.getCochesFlyPass()));
        
        System.out.print("Estado del peaje: ");
        System.out.println(p1.isEstadoPeaje());
        
        System.out.print("Coche en atención: ");
        System.out.println(p1.getCocheEnAtencion());
        
        System.out.print("Cantidad coches atendidos: ");
        System.out.println(p1.getCantidadCochesAtendidos());
    }
    
}
