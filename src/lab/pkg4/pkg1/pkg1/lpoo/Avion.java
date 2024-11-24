
package lab.pkg4.pkg1.pkg1.lpoo;

// Clase derivada: Avión
public class Avion extends Transporte {
    public Avion(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " está volando en el aire.");
    }

    public void registrarVuelo(String destino, int pasajeros) {
        System.out.println("Registrando vuelo a " + destino + " con " + pasajeros + " pasajeros.");
    }

    @Override
    public void iniciar() {
        System.out.println(nombre + " está despegando.");
    }

    @Override
    public void detener() {
        System.out.println(nombre + " ha aterrizado.");
    }
}

