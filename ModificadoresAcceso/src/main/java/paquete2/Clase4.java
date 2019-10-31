package paquete2;
import paquete1.Clase1;

public class Clase4 {
    public Clase4(){
        //Constructor protegido, restringido al no ser una subclase
        //super(1, 2);
        //Acceso package, y al no estar fuera de paquete esta restringido
        //super(1, 2, 3);
        //Acceso privado, restringido
        //super(1, 2, 3, 4);
    }
    
    public void pruebaDesdeClase4(){
        //Acceso a Clase 1 desde Clase 4
        //Clase 4 no es subclase y esta en otro paquete
        Clase1 c1 = new Clase1();
    }
}
