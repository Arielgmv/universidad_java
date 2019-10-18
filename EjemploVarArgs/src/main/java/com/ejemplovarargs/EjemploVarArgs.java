package com.ejemplovarargs;

public class EjemploVarArgs {
    public static void main(String[] args) {
        
    }
    
    public static void imprimirNumeros (int... numeros){
        //Recorremos cada elemento
        int elemento;
        for(int i=0; i<numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": "+elemento);
        }
    }
    
    public static void imprimirNumerosForEach (int... numeros){
        //Usamos un foreach en lugar de un for normal
        for(int numero : numeros){
            System.out.println("El numero es: " + numero);
        }
    }
    
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: " + nombre);
        System.out.println("Valido: " + valido);
        
        //Usamos un ForEach
        for(int numero : numeros){
            System.out.println("El numero es: " + numero);
        }
    }
}
