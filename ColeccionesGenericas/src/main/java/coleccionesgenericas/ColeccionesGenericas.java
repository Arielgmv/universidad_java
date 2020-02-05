package coleccionesgenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("ariel");
        miLista.add("ana");
        miLista.add("lo");
        miLista.add("reina");
        miLista.add("ariel");
        imprimir(miLista);
        
        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap();
        miMapa.put("1", "gato");
        miMapa.put("2", "perro");
        miMapa.put("3", "tortuga");
        miMapa.put("4", "cerdo");
        miMapa.put("1", "ave");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    private static void imprimir(Collection<String> col){
        for(String elemento: col){
            System.out.println("elemento: " + elemento);
        }
        System.out.println("");
    }
}
