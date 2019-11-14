package test;

import ejemploconversionesobjetos.Empleado;
import ejemploconversionesobjetos.Escritor;
import ejemploconversionesobjetos.TipoEscritura;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
    }
}
