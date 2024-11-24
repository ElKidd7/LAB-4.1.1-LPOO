
package lab.pkg4.pkg1.pkg1.lpoo;

// Clase derivada: Barco
public class Barco extends Transporte {
    public Barco(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " está navegando en el agua.");
    }

    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el barco.");
    }

    @Override
    public void iniciar() {
        System.out.println(nombre + " está listo para zarpar.");
    }

    @Override
    public void detener() {
        System.out.println(nombre + " está anclado.");
    }
}
