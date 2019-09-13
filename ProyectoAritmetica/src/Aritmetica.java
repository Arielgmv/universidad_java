public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //constructor vacio
    Aritmetica(){
    }
    //constructor con 2 argumentos
    Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }
    //Este metodo sumar toma los atributos de la clase
    int sumar(){
        return (a+b);
    }

    int restar(){
        return a-b;
    }

    int multiplicar(){
        return a*b;
    }

    int dividir(){
        return a/b;
    }
}
