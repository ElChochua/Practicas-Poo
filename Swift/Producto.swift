import Swift
class Producto{
    public var nombre:String
    public var precio:Int
    init(nombre:String,precio:Int){
        self.nombre = nombre;
        self.precio = precio;
    }
    func Abrir(){
        print("El producto \(self.nombre) se ha abierto")
    }
}
print("Ola")