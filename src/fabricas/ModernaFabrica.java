package fabricas;

import productos.Muebles;
import productos.mesilla.MesillaModerna;
import productos.silla.SillaModerna;
import productos.sofa.SofaModerna;

public class ModernaFabrica implements MueblesFabrica{
    @Override
    public Muebles crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Muebles crearSofa() {
        return new SofaModerna();
    }

    @Override
    public Muebles crearMesilla() {
        return new MesillaModerna();
    }
}
