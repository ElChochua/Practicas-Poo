import Swift
class Convertidor{
    public var Pesos:Float
    public var Dolar:Float
    public var Euros:Float
    public var Yen:Float
    //dolar 18.71 Yen 0.14  19.90
    init(){
        Dolar = 18.71
        Euros = 19.90
        Yen = 0.14
        self.Pesos = 0
    }
    func convertirPesosADolares()->Float{
        return Pesos / Dolar
    }
    func convertirPesosAEuros()->Float{
        return Pesos / Euros
    }
    func convertirPesosAYen()->Float{
        return Pesos / Yen
    }
}
let Conversor = Convertidor()
print("¿Que tipo de conversion quieres realizar?")
print("1. Pesos a Dolar")
print("2. Pesos a Euros")
print("3. Pesos a Yen")
var opcion = Int(readLine()!) ?? 0
switch opcion{
    case 1:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.Pesos = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosADolares())")
        case 2:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.Pesos = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosAEuros())")
        case 3:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.Pesos = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosAYen())")
        default:
        print("Introduce una opcion valida")
}