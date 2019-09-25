public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultado 1 = " + Operaciones.sumar(3, 4));
        System.out.println("Resultado 2= "+Operaciones.sumar(5, 4.1));
        System.out.println("Resultado 3= "+Operaciones.sumar(7.1, 6));
        //Cual es el metodo que se manda a llamar
        //un tipo double soporta un tipo long
        System.out.println("Resultado 4= "+Operaciones.sumar(3, 4L));

        System.out.println("Resultado 5= "+Operaciones.sumar(5F, 'A'));
    }
}
