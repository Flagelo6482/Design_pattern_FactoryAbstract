package fabricas;

import productos.Muebles;
import productos.mesilla.MesillaVictoriana;
import productos.silla.SillaVictoriana;
import productos.sofa.SofaVictoriana;

public class VictorianaFabrica implements MueblesFabrica{
    @Override
    public Muebles crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Muebles crearSofa() {
        return new SofaVictoriana();
    }

    @Override
    public Muebles crearMesilla() {
        return new MesillaVictoriana();
    }
}
