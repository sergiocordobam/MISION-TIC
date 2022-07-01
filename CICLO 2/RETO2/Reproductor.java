package reproductoraux;

public class Reproductor {
    //Atributos
    private String [] canciones;
    private int [] cancionesFavoritas;
    private boolean pausado = true;
    private int cancionReproduciendo = 0;
    
    //Constructor
    public Reproductor(String [] canciones){
        this.canciones = canciones;
        this.cancionesFavoritas = new int[canciones.length];
        for(int i = 0; i < canciones.length; i++){
            this.cancionesFavoritas[i] = -1;
        }
    }
    
    //Getters y Setters
    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public int[] getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(int [] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        this.cancionReproduciendo = cancionReproduciendo;
    }
    
    //Otros métodos
    public void proximaCancion(){
        cancionReproduciendo = (cancionReproduciendo + 1) % canciones.length;
    }
    
    public void devolverCancion(){
        cancionReproduciendo = (cancionReproduciendo + canciones.length - 1) % canciones.length;
    }
    
    public void cambiarEstadoReproduccion(){
        if(pausado){
            pausado = false;
        }else{
            pausado = true;
        }
    }
    
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < canciones.length; i++){
            if(cancionesFavoritas[i] == cancionReproduciendo){
                return;
            }else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                break;
            }
        }
        
    }
    
    
}
