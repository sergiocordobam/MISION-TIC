package peaje;

public class Peajeaux {
    private String filaCoches [];
    private String cochesFlyPass [];
    private boolean estadoPeaje = true;
    private int cantidadCochesAtendidos = 1;
    private int cocheEnAtencion = 0;
    
    //Constructor
    public Peajeaux(String [] filaCoches){
        this.filaCoches = filaCoches;
        this.cochesFlyPass = new String [filaCoches.length];
        for(int i = 0; i < filaCoches.length; i++){
            this.cochesFlyPass[i] = " ";
        }
    }
    
    // Getters y Setters
    public String [] getFilaCoches(){
        return filaCoches;
    }
    
    public void setFilaCoches(String[] filaCoches){
        this.filaCoches = filaCoches;
    }
    
    public String [] getCochesFlyPass(){
        return cochesFlyPass;
    }
    
    public void setCochesFlyPass(String [] cochesFlyPass){
        this.cochesFlyPass = cochesFlyPass;
    }
    
    public boolean isEstadoPeaje(){
        return estadoPeaje;
    }
    
    public void setEstadoPeaje(boolean estadoPeaje){
        this.estadoPeaje = estadoPeaje;
    }
    
    public int getCantidadCochesAtendidos(){
        return cantidadCochesAtendidos;
    }
    
    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos){
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }
    
    public int getCocheEnAtencion(){
        return cocheEnAtencion;
    }
    
    public void setCocheEnAtencion(int cocheEnAtencion){
        this.cocheEnAtencion = cocheEnAtencion;
    }
    
    // Demás métodos
    public void proximoCoche(){
        if(estadoPeaje){
            cocheEnAtencion++;
            cantidadCochesAtendidos++;
        }
    }
    
    public void agregarCocheFlyPass(){
        for(int i = 0; i < cochesFlyPass.length; i++){
            if(" ".equals(cochesFlyPass[i])){
                cochesFlyPass[i] = filaCoches[cocheEnAtencion];
                break;
            }
        }
    }
    
    public void cambiarEstadoPeaje(){
        if(estadoPeaje){
            estadoPeaje = false;
        }else{
            estadoPeaje = true;
        }
    }
}
