
package lab.pkg4.pkg1.pkg1.lpoo;

// Clase principal para probar el sistema
public class SistemaTransporte {
    public static void main(String[] args) {
        // Polimorfismo dinámico: Usar referencias de la clase base
        Transporte auto = new Auto("Toyota Corolla");
        Transporte barco = new Barco("Barco Mercante");
        Transporte avion = new Avion("Boeing 747");

        // Nivel 2: Sobreescritura
        auto.mover();
        barco.mover();
        avion.mover();

        // Nivel 1: Sobrecarga (con cast para acceder a métodos específicos)
        Auto miAuto = (Auto) auto;
        miAuto.registrarPasajeros(4);
        miAuto.registrarPasajeros(new String[] { "Juan", "Ana", "Luis" });

        Barco miBarco = (Barco) barco;
        miBarco.cargarMercancia(5000.0);

        Avion miAvion = (Avion) avion;
        miAvion.registrarVuelo("Nueva York", 180);

        // Nivel 3: Enlace dinámico
        Transporte[] transportes = { auto, barco, avion };
        for (Transporte t : transportes) {
            t.informacion();
            t.iniciar();
            t.detener();
        }
    }
}
