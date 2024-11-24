
package lab.pkg4.pkg1.pkg1.lpoo;

// Clase derivada: Auto
public class Auto extends Transporte {
    public Auto(String nombre) {
        super(nombre);
    }

    // Sobreescritura de método abstracto
    @Override
    public void mover() {
        System.out.println(nombre + " está conduciendo en carretera.");
    }

    // Sobrecarga: Registrar pasajeros con diferentes parámetros
    public void registrarPasajeros(int cantidad) {
        System.out.println("Registrando " + cantidad + " pasajeros en el auto.");
    }

    public void registrarPasajeros(String[] nombres) {
        System.out.println("Registrando pasajeros: " + String.join(", ", nombres));
    }

    @Override
    public void iniciar() {
        System.out.println(nombre + " está encendido.");
    }

    @Override
    public void detener() {
        System.out.println(nombre + " está apagado.");
    }
}
