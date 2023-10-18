package test;

import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        
        Empleado empleado1 = new Empleado("Alex",3000);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Juan",4000);
        System.out.println(empleado2);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha,true,"Suny",'F',18,"Santo Tomas");
        System.out.println(cliente1);
    }    
}
