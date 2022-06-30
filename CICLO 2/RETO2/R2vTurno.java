package turnovirtual;
import java.util.Arrays;
public class R2vTurno {
    public static void main(String [] args){
        String [] cola = {"A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11",};
        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();
        
        System.out.print("Turnos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnos()));
        
        System.out.print("Turnos perdidos: ");
        System.out.println(Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        
        System.out.print("Estado del turno virtual: ");
        System.out.println(turnoVirtual1.isEstadoTurnoVirtual());
        
        System.out.print("Turno en atención: ");
        System.out.println(turnoVirtual1.getTurnoEnAtencion());
        
        System.out.print("Cantidad de turnos atendidos: ");
        System.out.println(turnoVirtual1.getCantidadTurnosAtendidos());
    }
}
