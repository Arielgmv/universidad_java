import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel", 16300);
        empleado1.setEdad(38);
        empleado1.setGenero('m');
        empleado1.setDireccion("Barrio Municipal");
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Rodrigo");
        cliente1.setGenero('m');
        cliente1.setEdad(24);
        cliente1.setDireccion("Obrajes Calle 17");
        System.out.println("cliente1 = " + cliente1);
    }
}
