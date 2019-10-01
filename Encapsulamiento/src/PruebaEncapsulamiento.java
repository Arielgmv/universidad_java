public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel", "Muñoz", true);
        System.out.println(persona1.getNombre());
        //System.out.println(persona1.nombre);
        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());
        System.out.println(persona1);
        persona1.setBorrado(false);
        System.out.println(persona1);
    }
}
