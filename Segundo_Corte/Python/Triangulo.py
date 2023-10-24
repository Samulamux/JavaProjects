import math
class Triangulo:
    def __init__(self,base,altura):
        print("Creando un triangulo rectangulo de base {b} y altura {a}".format(b=base,a=altura))
        self.base = base
        self.altura = altura
    def area(self):
        return (self.base*self.altura)/2
    def perimetro(self):
        return math.sqrt(self.base*2+self.altura*2)+self.base+self.altura
small_box = Triangulo(5,3)
medium_box = Triangulo(10,5)
big_box = Triangulo(20,15)
print("Area:", small_box.area(),"Perimetro:", small_box.perimetro())
print("Area:", medium_box.area(),"Perimetro:", medium_box.perimetro())
print("Area:", big_box.area(),"Perimetro:", big_box.perimetro())