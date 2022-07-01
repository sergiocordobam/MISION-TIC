package reproductoraux;
import java.util.Arrays;
public class Reproductoraux {

    public static void main(String[] args) {
        String [] canciones = {
            "Mil horas",
            "Por ese hombre",
            "A esa",
            "Algo de mi",
            "Si me dejas ahora",
            "¿Quieres ser mi amante?",
            "Quel sorriso in volto",
            "Per una notte insieme",
            "Como un pintor",
            "Sencillamente",
            "Un segundo",
            "Enciéndeme",
            "Cuando me enamoro",
            "Tu eres mi tesoro",
            "Piccola anima",
            "Solo a ti pertenezco",
            "Todos por todos"
        };
        Reproductor r1 = new Reproductor(canciones);
        
        r1.devolverCancion();
        r1.devolverCancion();
        r1.devolverCancion();
        r1.devolverCancion();
        
        r1.agregarCancionesFavoritas();
        r1.proximaCancion();
        r1.agregarCancionesFavoritas();
        r1.devolverCancion();
        r1.agregarCancionesFavoritas();
        
        r1.cambiarEstadoReproduccion();
        r1.cambiarEstadoReproduccion();
        r1.cambiarEstadoReproduccion();
        r1.cambiarEstadoReproduccion();
        r1.cambiarEstadoReproduccion();
        
        System.out.print("Canciones: ");
        System.out.println(Arrays.toString(r1.getCanciones()));
        
        System.out.print("Canciones favoritas: ");
        System.out.println(Arrays.toString(r1.getCancionesFavoritas()));
        
        System.out.print("Pausado: ");
        System.out.println(r1.isPausado());
        
        System.out.print("Cancion en reproducción: ");
        System.out.println(r1.getCancionReproduciendo());
    }
    
}
