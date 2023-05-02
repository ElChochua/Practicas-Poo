import Swift

class Producto {
    public var nombre: String
    public var precio: Int
    
    init(nombre: String, precio: Int) {
        self.nombre = nombre
        self.precio = precio
    }
    
    func Abrir() {
        print("El producto se ha abierto")
    }
    
    func Cerrar() {
        print("El producto se ha cerrado")
    }
}

class Refresco: Producto {
    public var contenido: Int
    public var sabor: String
    
    init(contenido: Int, sabor: String, nombre: String, precio: Int) {
        self.contenido = contenido
        self.sabor = sabor
        super.init(nombre: nombre, precio: precio)
    }
    
    override func Abrir() {
        print("El refresco se ha abierto")
    }
}

let miRefresco = Refresco(contenido: 600, sabor: "cola", nombre: "Coca Cola", precio: 16)
miRefresco.Abrir()
miRefresco.Cerrar()
