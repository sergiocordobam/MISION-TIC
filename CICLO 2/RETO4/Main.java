
package reto4;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Reto4 ej = new Reto4();
        ArrayList <Cliente> t3 = new ArrayList<>();
        t3.add(new Cliente("Valeria Di", "10367876354", 9653, "03/07/22", "004"));
        t3.add(new Cliente("Johan Doe", "234623493", 3918, "03/07/22", "005"));
        t3.add(new Cliente("Maurice Doe", "10367876354", 6048, "03/07/22", "006"));
        t3.add(new Cliente("Mathhew Doe", "10367876354", 5840, "03/07/22", "007"));
        t3.add(new Cliente("Agustina Doe", "10367876354", 3940, "03/07/22", "008"));
        t3.add(new Cliente("Agustina Doe", "10367876354", 3840, "03/07/22", "009"));
        t3.add(new Cliente("Milena Doe", "10367876354", 3696, "03/07/22", "0010"));
        t3.add(new Cliente("Carla Di", "10367876354", 2432, "03/07/22", "01"));
        System.out.println(Arrays.toString(ej.reportes(t3)));
    }
}
