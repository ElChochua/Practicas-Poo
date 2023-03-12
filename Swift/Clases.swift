import Swift
class Persona{
    var nombre:String
    var edad:Int
    init(nombre:String,edad:Int){
        self.nombre = nombre
        self.edad = edad
    }
    func saludar(){
        print("Hola, mi nombre es \(self.nombre) y tengo \(self.edad) años")
    }
}
class auto{
    var modelo:String
    var marca:String
    var color:String
    var velocidad:Float
    var peso: Float
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
class refrigerador{
    var marca:String
    var modelo:String
    var color:String
    var temp:Float
    var altura:Float
    var capacidad:Float
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
refri1.enfriar()
let auto1 = auto(modelo:"2019",marca:"Toyota",color:"Rojo",velocidad:200,peso:1000)
auto1.encender()
let PersonaJ = Persona(nombre:"Juan",edad:20)
PersonaJ.saludar()
