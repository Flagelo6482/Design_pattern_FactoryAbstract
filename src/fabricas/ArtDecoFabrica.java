package fabricas;

import productos.Muebles;
import productos.mesilla.MesillaArtDeco;
import productos.silla.SillaArtDeco;
import productos.sofa.SofaArtDeco;

public class ArtDecoFabrica implements MueblesFabrica{
    @Override
    public Muebles crearSilla() {
        return new SillaArtDeco();
    }

    @Override
    public Muebles crearSofa() {
        return new SofaArtDeco();
    }

    @Override
    public Muebles crearMesilla() {
        return new MesillaArtDeco();
    }
}
