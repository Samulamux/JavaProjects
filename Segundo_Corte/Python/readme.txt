package scm;
public class Circle {

    public float pi = (float) 3.14;        
    
    public Circle()
    {
    }
    
    public float Circle(float diametro) {
        float radio = diametro/2;
        return radio;
        
    }
    
    public float perimeter(float radio){
        float p = radio+radio+radio;
        return p;            
    }
    
    public float area(float radio){
        float a = pi*radio*radio;
        return a;
    }
        
    public static void main(String[] args){
        
        Circle circulo1 = new Circle();
        float radio = circulo1.Circle(28);
        float per = circulo1.perimeter(radio);
        float ar = circulo1.area(radio);
        System.out.println(ar);
        
        
        
        /*Circle circulo2 = new Circle(36);
        System.out.println(circulo2.circunferencia);
        
        Circle circulo3 = new Circle(11460);
        System.out.println(circulo3.circunferencia); */
    }
}


