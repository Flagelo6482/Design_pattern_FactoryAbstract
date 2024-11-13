package productos.silla;

import productos.Muebles;

public class SillaModerna implements Muebles {
    @Override
    public void crear() {
        System.out.println("Creando una silla Moderna!");
    }
}
