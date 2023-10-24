class Rectangulo:
    def __init__(self,base,altura):
        print("Creando un rectangulo de base {b} y altura {a}".format(b=base,a=altura))
        self.base = base
        self.altura = altura
    def area(self):
        return self.base*self.altura
    def perimetro(self):
        return (2*self.base)+(2*self.altura)
small_box = Rectangulo(5,3)
medium_box = Rectangulo(10,5)
big_box = Rectangulo(20,15)
print("Area:", small_box.area(),"Perimetro:", small_box.perimetro())
print("Area:", medium_box.area(),"Perimetro:", medium_box.perimetro())
print("Area:", big_box.area(),"Perimetro:", big_box.perimetro())