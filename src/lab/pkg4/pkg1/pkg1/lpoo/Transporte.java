
package lab.pkg4.pkg1.pkg1.lpoo;

// Clase abstracta base
public abstract class Transporte implements TransporteOperaciones {
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que será sobrescrito
    public abstract void mover();

    // Método común para todos los transportes
    public void informacion() {
        System.out.println("Transporte: " + nombre);
    }
}

