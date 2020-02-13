package test;

import java.util.Scanner;
import static calculadora.Operaciones.*;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Proporciona el segundo valor");
        int b = scanner.nextInt();
        int suma = sumar(a, b);
        int resta = restar(a, b);
        int multiplicacion = multiplicar(a, b);
        int division = dividir(a, b);
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
}
