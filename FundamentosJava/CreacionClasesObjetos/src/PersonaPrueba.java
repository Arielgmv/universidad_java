public class PersonaPrueba {
    public static void main(String[] args) {
        //Creación de un objeto
        Persona persona1 = new Persona();
        //Llamando a un método del objeto creado
        System.out.println("Valores por default del objeto persona");
        persona1.desplegarNombre();
        //Modificar valores del objeto creado
        persona1.nombre = "Ariel";
        persona1.apellidoPaterno = "Muñoz";
        persona1.apellidoMaterno = "Villegas";
        persona1.desplegarNombre();
        //Creación de un segundo objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Oswaldo";
        persona2.apellidoPaterno = "Soliz";
        persona2.apellidoMaterno = "Villegas";
        persona2.desplegarNombre();
    }
}
