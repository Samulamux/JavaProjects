package herencia;

import java.util.Objects;

public class Person {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //----------------CONSTRUCTORS-------------------

    public Person() {
    }

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //---------------------------------------
    
    public String obtenerDetalle() {
        return "Nombre: %s Edad: %d ".formatted(this.nombre, this.edad);
    }
    
    //--------------GETTERS------------------

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //---------------SETTERS----------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //--------------toString------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + this.genero;
        hash = 23 * hash + this.edad;
        hash = 23 * hash + Objects.hashCode(this.direccion);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        
        if (this.genero != other.genero) {
            return false;
        }
        
        if (this.edad != other.edad) {
            return false;
        }
        
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
}
