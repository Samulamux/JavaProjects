package herencia;

public class Empleado extends Person{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(double sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }
    
    //-----------GETTERS------------

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    //-----------SETTERS--------------

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    } 

    //---------------toString---------------------

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + "Sueldo: " + this.sueldo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
