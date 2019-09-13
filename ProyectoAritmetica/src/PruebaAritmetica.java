public class PruebaAritmetica {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Aritmetica
        Aritmetica objeto1 = new Aritmetica();
        objeto1.a = 5;
        objeto1.b = 3;
        int resultado = objeto1.sumar();
        System.out.println("resultado = "+resultado);
        //Creamos un objeto de tipo Aritmetica
        Aritmetica objeto2 = new Aritmetica(2, 4);
        System.out.println("resultado 2 = "+objeto2.sumar());

        //Variables locales
        int operandoA = 6;
        int operandoB = 2;
        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto3 = new Aritmetica(operandoA, operandoB);
        System.out.println("Operando A = "+operandoA);
        System.out.println("Operando B = "+operandoB);

        System.out.println("Resultado suma: " + objeto3.sumar());
        System.out.println("Resultado resta: " + objeto3.restar());
        System.out.println("Resultado multiplicación: " + objeto3.multiplicar());
        System.out.println("Resultado división: " + objeto3.dividir());
    }
}
