package partido;

public class Preferencial extends Asistente{
    //Atributos
    private boolean participaSorteo = false;
    
    //Constructor
    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
    }
    
    //Métodos
    public void participarSorteo(){
        if(participaSorteo){
            participaSorteo = false;
        }else{
            participaSorteo = true;
        }
    }
    
    //Getters y Setters
    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    
}
