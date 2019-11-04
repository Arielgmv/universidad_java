package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

public class ModificadoresAcceso {
    public static void main(String[] args) {
        //Prueba de accesos a Clase 1 desde otras clases
        //Acceso a Clase 1 desde Clase 2
        System.out.println("***Acceso desde Clase 2 a Clase 1 (mismo paquete)***");
        new Clase2().pruebaDesdeClase2();
        
        //Acceso a Clase 1 desde Clase 2
        //Clase 3 extiende de Clase 1
        System.out.println("\n***Acceso desde Clase 3 a Clase 1 (diferente paquete, pero es subclase)***");
        new Clase3().pruebaDesdeClase3();
        
        //Acceso a Clase 1 desde Clase 4
        //Clase 4 no es subclase y está en otro paquete
        System.out.println("\n***Acceso desde Clase 4 a Clase 1 (diferente paquete, no es subclase)***");
        new Clase4().pruebaDesdeClase4();
    }
}
