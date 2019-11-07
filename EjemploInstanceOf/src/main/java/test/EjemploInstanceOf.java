package test;

import ejemploinstanceof.Empleado;
import ejemploinstanceof.Gerente;

public class EjemploInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        determinaTipo(empleado);
        
        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        //determinaTipo(gerente);
        
    }
    
    //Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
    //Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    //eso es polimorfismo, multiples formas pero en tiempo de ejecucion
    public static void determinaTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento del gerente: " + gerente.getDepartamento());
            //System.out.println(((Gerente) emp).getDepartamento());
        }
        
        else if(empleado instanceof Empleado){
            System.out.println("nombre empleado: " + empleado.getNombre());            
        }
        
        else if(empleado instanceof Object){
            System.out.println("Object: " + empleado.toString());
        }
    }
}
