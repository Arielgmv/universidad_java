public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel", 38);
        System.out.println("persona1 = " + persona1);

        Empleado empleado1 = new Empleado("Ana", 39, 11500);
        System.out.println("empleado1 = " + empleado1);
    }
}
