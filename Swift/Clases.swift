import Swift
public class Persona{
    internal var nombre:String
    internal var edad:Int
    init(nombre:String,edad:Int){
        self.nombre = nombre
        self.edad = edad
    }
    func saludar(){
        print("Hola, mi nombre es \(self.nombre) y tengo \(self.edad) años")
    }
}
public class auto{
    internal var modelo:String
    internal var marca:String
    internal var color:String
    internal var velocidad:Float
    internal var peso: Float
    init(modelo:String,marca:String,color:String,velocidad:Float,peso:Float){
        self.modelo = modelo
        self.marca = marca
        self.color = color
        self.velocidad = velocidad
        self.peso = peso
    }
    func encender(){
        print("El auto \(self.modelo) de la marca \(self.marca) se ha encendido")
    }
}
public class refrigerador{
    internal  var marca:String
    internal var modelo:String
    internal var color:String
    internal var temp:Float
    internal var altura:Float
    internal var capacidad:Float
    init(marca:String,modelo:String,color:String,temp:Float,altura:Float,capacidad:Float){
        self.marca = marca
        self.modelo = modelo
        self.color = color
        self.temp = temp
        self.altura = altura
        self.capacidad = capacidad
    }
    //En la libreta le puse encender pero se escucha mas perron enfriar
    func enfriar(){
        print("El refrigerador \(self.modelo) de la marca \(self.marca) se ha encendido")
    }
}
let refri1 = refrigerador(marca:"LG",modelo:"2022",color:"Plateado",temp:0,altura:2.5,capacidad:1000)
refri1.marca = "Samsung"
refri1.enfriar()
let auto1 = auto(modelo:"2019",marca:"Toyota",color:"Rojo",velocidad:200,peso:1000)
auto1.encender()
let PersonaJ = Persona(nombre:"Juan",edad:20)
PersonaJ.saludar()
