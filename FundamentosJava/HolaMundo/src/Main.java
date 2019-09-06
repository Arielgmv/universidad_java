public class Main {
    public static void main (String[] args){
        String saludos = "Hola Mundo";
        System.out.println(saludos);
        System.out.println(saludos);
        System.out.println(saludos);

        var despedirse="despedirse";
        System.out.println();
        System.out.println(despedirse);

        var usuario = "Juan";
        var saludar = "Hola";
        System.out.println(saludar+" "+usuario);
        //Saludos, mi nombre es Juan
        System.out.println("Saludos, mi nombre es "+usuario);
        System.out.println("saludar = " + saludar);

        String nombre="Karla";
        String apellido="Esparza";
        System.out.println(nombre+" "+apellido);
        System.out.println("Nueva linea: \n"+nombre );
        System.out.println("Nueva linea: \t"+nombre );
        System.out.println("Nueva linea: \b"+nombre );
        System.out.println("Retorno de carro: \r"+nombre );
        System.out.println("Comilla simple: \'"+nombre+"\'");
        System.out.println("Comilla doble: \""+nombre+"\"");
    }
}
