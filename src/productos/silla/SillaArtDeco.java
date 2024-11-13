package productos.silla;

import productos.Muebles;

public class SillaArtDeco implements Muebles {

    @Override
    public void crear() {
        System.out.println("Creando una silla Art Deco!");
    }
}
