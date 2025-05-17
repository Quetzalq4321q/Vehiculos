package Main;
import Vehiculos.*;

public class Main {
    public static void gestionarVehiculo(Vehiculo v) {
        v.encender();

        if (v instanceof Coche) {
            Coche c = (Coche) v;
            c.apagar();
        } else if (v instanceof Moto) {
            Moto m = (Moto) v;
            m.levantarPatada();
        } else if (v instanceof Camion) {
            Camion cam = (Camion) v;
            cam.conectarRemolque();
        }

        v.apagar();
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        gestionarVehiculo(miCoche);
    }
}
  /*
  DIAGRAMA DE MEMORIA:
  STACK:

  ┌────────────────────┐
  │ args               │
  │────────────────────│
  │ → referencia []    │
  ├────────────────────┤
  │ miCoche            │
  │────────────────────│
  │ → #A               │
  ├────────────────────┤
  │ v (parámetro)      │
  │────────────────────│
  │ → #A               │
  ├────────────────────┤
  │ c (downcast Coche) │
  │────────────────────│
  │ → #A               │
  └────────────────────┘

  HEAP:

  #A (Coche):
  ┌────────────────────────────────────────────┐
  │ Clase hija de Vehiculo                    │
  │ Métodos:                                  │
  │  - encender(): "Coche encendido"          │
  │  - apagar(): "Coche apagado"              │
  │  - abrirMaletero(): "Maletero abierto"    │
  └────────────────────────────────────────────┘

  */
