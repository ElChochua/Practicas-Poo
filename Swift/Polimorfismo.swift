import Swift
class FiguraGeometrica{
    private var nombre = ""
    private var perimetro = 0.0
    private var area = 0.0

    func setNombre(nombre:String){
        self.nombre = nombre
    }
    func getNombre(){
        print(self.nombre)
    }
    func calcularPerimetro(){
        print("Perimetro")
    }
    func calcularArea(){
        print("Area")
    }
    func dibujar(){
        print("ei")
    }
}
class Cuadrado: FiguraGeometrica{
    private var medidaLado = 0.0
    private let lado = 4.0
    init(medidaLado:Double){
        self.medidaLado = medidaLado
    }
    override func calcularArea(){
        print(medidaLado * medidaLado)
    }
    override func calcularPerimetro(){
        print(medidaLado * lado)
    }
    override func dibujar(){
        let lado = 4
    for i in 1...lado {
     for j in 1...lado {
        if i == 1 || i == lado || j == 1 || j == lado {
            print("*", terminator: "")
        } else {
            print(" ", terminator: "")
        }
    }
    print("")
    }

    }
}
class Rectangulo: FiguraGeometrica{
    private var altura = 0
    private var ancho = 0
    init(altura:Int,ancho:Int){
        self.altura = altura
        self.ancho = ancho
    }
    override func calcularArea(){
        print(ancho * altura)
    }
    override func calcularPerimetro(){
        print((altura*2) + (ancho*2))
    }
    override func dibujar(){
    let ancho = self.ancho
    let alto = self.altura
    for i in 1...ancho {
        for j in 1...alto {
            if i == 1 || i == ancho || j == 1 || j == altura {
                print("*", terminator: "") // imprimir un asterisco en las posiciones de los bordes
            } else {
                print(" ", terminator: "") // imprimir un espacio en las posiciones interiores
            }
        }
    print() // saltar a la siguiente línea
}
} 
}

let cuadrado = Cuadrado(medidaLado:23)
let rectangulo = Rectangulo(altura:12,ancho:22)
rectangulo.setNombre(nombre:"Rectangulo")
cuadrado.setNombre(nombre:"Cuadrado")
cuadrado.getNombre()
cuadrado.calcularArea()
cuadrado.calcularPerimetro()
cuadrado.dibujar()
rectangulo.getNombre()
rectangulo.calcularArea()
rectangulo.calcularPerimetro()
rectangulo.dibujar()