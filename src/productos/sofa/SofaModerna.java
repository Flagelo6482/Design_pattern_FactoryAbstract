package productos.sofa;

import productos.Muebles;

public class SofaModerna implements Muebles {
    @Override
    public void crear() {
        System.out.println("Creando un sofa Moderno!");
    }
}
