package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add(201);
        miLista.add("2");
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        //imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //elemento duplicado no se agrega, Set no agrega elementos duplicados
        miSet.add("300");
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        //llave, valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Carla");
        miMapa.put("valor3", "Carlos");
        //elemento duplicado, sustituye al valor agregado previamente
        miMapa.put("valor3", "Rosario");
        //imprimimos las llaves
        imprimir(miMapa.keySet());
        //imprimimos valores
        imprimir(miMapa.values());
        
        System.out.println(miMapa.get("valor3"));
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento1: coleccion){
            System.out.println("Elemento: " + elemento1);
        }
        System.out.println("");
    }
}
