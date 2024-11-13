package productos.mesilla;

import productos.Muebles;

public class MesillaModerna implements Muebles {
    @Override
    public void crear() {
        System.out.println("Creando una mesilla Moderna!");
    }
}
