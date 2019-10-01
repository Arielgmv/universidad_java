public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //Modificar un atributo final
        /*Persona persona1 = new Persona();
        persona1.setNombre("Ariel");
        System.out.println(persona1.getNombre());

        ClaseFinal claseFinal = new ClaseFinal();
        claseFinal.VAR_PRIMITIVO=12;*/
        //ClaseFinal.VAR_PRIMITIVO=20;
        //Modificar la referencia de un atributo de tipo object
        //ClaseFinal.VAR_PERSONA = new Persona();
        ClaseFinal.VAR_PERSONA.setNombre("Ariel");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Ana");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
