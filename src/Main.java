import fabricas.ArtDecoFabrica;
import fabricas.ModernaFabrica;
import fabricas.MueblesFabrica;
import productos.Muebles;

public class Main {
    public static void main(String[] args) {

        /*
        * 1.Fabrica Art Deco
        * 2.Fabrica Moderna
        * 3.Fabrica Victoriana
        * */
        //Elegimos el tipo de fabrica/estilo que deseamos generar
        MueblesFabrica mueblesFabrica = new ArtDecoFabrica();
        MueblesFabrica mueblesFabrica1 = new ModernaFabrica();

        /*
        * 1.Silla
        * 2.Mesilla
        * 3.Sofa
        * */
        //Elegimos el tipo de producto (silla, sofa o mesilla) con
        Muebles sofaArtDeco = mueblesFabrica.crearSofa();
        Muebles mesillaModerna = mueblesFabrica1.crearMesilla();

        /*
        * Generamos el producto
        * */
        //generamos el producto con el metodo "crear()"
        sofaArtDeco.crear();
        mesillaModerna.crear();

    }
}