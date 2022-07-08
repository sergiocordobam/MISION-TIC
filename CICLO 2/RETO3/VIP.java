package partido;
import java.util.Random;
public class VIP extends Asistente{
    //Atributos
    private boolean [] pantallas = new boolean[]{false,false,false};
    private String credencialesPrevia = "";
    
    //Constructor
    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
    }
    
    //Métodos
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }
    
    public void asignarPantalla(int pantalla){
        if(pantalla < 1 || pantalla > 3){
            return;
        }else{
            if(pantallas[pantalla-1] == true){
                pantallas[pantalla-1] = false;
            }else{
                pantallas[pantalla-1] = true;
            }
        }
    }
    
    //Getters y Setters
    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    
}
