class Cuadrado:
    def __init__(self, altura):
        print("Creando cuadrado de altura {a}".format(a=altura))
        self.base = altura
    def area(self):
        return self.base*self.base
small_box = Cuadrado(5)
medium_box = Cuadrado(10)
big_box = Cuadrado(20)
print(small_box.area())
print(medium_box.area())
print(big_box.area())