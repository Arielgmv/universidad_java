public class PalabraNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("Persona1 = " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("persona2 = " + persona2.obtenerNombre());

        //Hacemos que persona1 ya no apunte al objeto persona
        persona1 = null; //es candidata para que la elimine el recolector de basura
        System.gc();//garbage collector sólo planifica la llamada
        persona2 = null;
        if(persona1 != null)
            System.out.println("persona1 = " + persona1.obtenerNombre());
    }
}

class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}
