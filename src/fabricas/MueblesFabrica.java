package fabricas;

import productos.Muebles;

public interface MueblesFabrica {
    Muebles crearSilla();
    Muebles crearSofa();
    Muebles crearMesilla();
}
