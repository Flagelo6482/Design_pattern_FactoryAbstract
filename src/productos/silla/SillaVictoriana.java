package productos.silla;

import productos.Muebles;

public class SillaVictoriana implements Muebles {
    @Override
    public void crear() {
        System.out.println("Creando una silla Victoriana");
    }
}
