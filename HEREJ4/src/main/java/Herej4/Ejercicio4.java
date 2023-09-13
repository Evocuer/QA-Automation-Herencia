package Herej4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Servicio.CirculoServicio;
import Servicio.RectanguloServicio;

public class Ejercicio4 {

    public static void main(String[] args) {

        CirculoServicio cs = new CirculoServicio();
        RectanguloServicio rs = new RectanguloServicio();

        Circulo c1 = cs.crearCirculo(5d);
        Rectangulo r1 = rs.crearRectangulo(4d, 3d);

        System.out.println(c1.toString());
        c1.area();
        c1.perimetro();
        System.out.println("-----------");
        System.out.println(r1.toString());
        r1.area();
        r1.perimetro();

    }

}
