package test;

import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        
        Person persona = new Person("Juan",'M', 25, "Cusco");
        imprimir(persona);
        
        Empleado empleado1 = new Empleado(3000, "Alex", 23);
        imprimir(empleado1);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha,true,"Suny",'F',18,"Santo Tomas");
        imprimir(cliente1);
        
        
    }
    
    public static void imprimir(Person personaje) {
        System.out.println(personaje.obtenerDetalle());
    }
}
