package turnovirtual;
public class TurnoVirtual {
    // Inserte los atributos
    private String [] turnos;
    private String [] turnosPerdidos;
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;
    
    //Inserte el método constructor
    public TurnoVirtual(String [] turnos){
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        for(int i = 0; i < turnos.length; i++){
            this.turnosPerdidos[i] = " ";
        } 
    }

   
    //Inserte los getters y los setters

    public String [] getTurnos(){
        return turnos;
    }
    
    public void setTurnos(String [] turnos){
        this.turnos = turnos;
    }
    
    public String [] getTurnosPerdidos(){
        return turnosPerdidos;
    }
    
    public void setTurnosPerdidos(String [] turnosPerdidos){
        this.turnosPerdidos = turnosPerdidos;
    }
    
    public boolean isEstadoTurnoVirtual(){
        return estadoTurnoVirtual;
    }
    
    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual){
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }
    
    public int getTurnoEnAtencion(){
        return turnoEnAtencion;
    }
    
    public void setTurnoEnAtencion(int turnoEnAtencion){
        this.turnoEnAtencion = turnoEnAtencion;
    }
    
    public int getCantidadTurnosAtendidos(){
        return cantidadTurnosAtendidos;
    }
    
    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos){
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    //Inserte los demás métodos
    
    public void atenderProximoTurno(){
        if(estadoTurnoVirtual){
            turnoEnAtencion++;
            cantidadTurnosAtendidos++;
        }
    }
    
    public void cambiarEstadoTurno(){
        if(estadoTurnoVirtual){
            estadoTurnoVirtual = false;
        }else{
            estadoTurnoVirtual = true;
        }
    }
    
    //No se debe por desarrollar este método
    
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }  
    
    
    
    
}
