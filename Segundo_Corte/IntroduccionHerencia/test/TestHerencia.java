package test;

import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        
        Person persona = new Person("Juan",'M', 25, "Cusco");
        System.out.println(persona.obtenerDetalle());
        
        Empleado empleado1 = new Empleado(3000, "Alex", 23);
        System.out.println(empleado1.obtenerDetalle());
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha,true,"Suny",'F',18,"Santo Tomas");
        System.out.println(cliente1.obtenerDetalle());
    }
    
    public static void imprimir(Person personaje) {
        System.out.println(personaje.obtenerDetalle());
    }
}
