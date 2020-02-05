package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[] args) {
        //**lo que esta entre <> son tipo object, no acepta tipos primitivos como int
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("ariel");
        objetoString.obtenerTipo();
        
        //No es posible utilizar tipos primitivos en clases genéricas
        //ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(1);
    }
}
