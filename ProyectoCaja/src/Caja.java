public class Caja {
    int alto;
    int ancho;
    int profundo;
    //constructor vacio
    Caja(){

    }
    //constructor con 3 argumentos
    Caja(int alto, int ancho, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    //Método para cálculo de volumen
    int volumen(){
        return ancho*alto*profundo;
    }
}
