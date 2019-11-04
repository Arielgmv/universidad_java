package ejemploenumeraciones;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        //Valores de la enumeracion
        System.out.println("Valor de 1: " + Dias.DOMINGO);

        //Hacemos un test del dia indicado
        indicarDia(Dias.LUNES);

        //Utilizamos la enumercion de paises
        System.out.println(" Continente N.-1: " + Continentes.AFRICA);
        System.out.println("Paises en Africa: " + Continentes.AFRICA.getPaises());
        
        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        System.out.println("");
        imprimirContinentes();
    }

    public static void indicarDia(Dias dias) {
        switch (dias) {
            //Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Indica un dia de la semana");
        }
    }

    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            //Podemos usar algun valor constante
            //de la enumeracion directamente
            case AFRICA:
                System.out.println("No. Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demas continentes");
        }
    }

    public static void imprimirContinentes() {
        //Utilizamos un foreach
        for (Continentes c : Continentes.values()) {
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + " paises");
        }
    }
}
