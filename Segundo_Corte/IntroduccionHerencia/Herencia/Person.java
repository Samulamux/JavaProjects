package herencia;

public class Person {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //----------------CONSTRUCTORS-------------------

    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(char genero, int edad, String direccion) {
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
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
        sb.append("Person{");
        sb.append("nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
  
}
