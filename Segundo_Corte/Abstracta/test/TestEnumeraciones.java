package test;

import enumeraciones.*;

public class TestEnumeraciones {
    
    public static void main(String[] args){
        
        System.out.println(Dias.Domingo);
        System.out.println(Dias.Viernes);
        
        System.out.println(Continentes.America);
        System.out.println(Continentes.America.getPaises());
        
        Continentes continente = Continentes.America;
        System.out.println(continente.getPaises());
    }
}
