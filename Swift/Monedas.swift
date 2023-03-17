import Swift
//💴💴Yenes 🤑🤑Pesos 💵Dolares 💶Euros
class Convertidor{
    public var 🤑🤑:Float
    internal var 💵💵:Float
    internal var 💶💶:Float
    internal var 💴💴:Float
    init(){
        💵💵 = 18.71
        💶💶 = 19.90
        💴💴 = 0.14
        self.🤑🤑 = 0
    }
    func convertirPesosADolares()->Float{
        return 🤑🤑 / 💵💵
    }
    func convertirPesosAEuros()->Float{
        return 🤑🤑 / 💶💶
    }
    func convertirPesosAYen()->Float{
        return 🤑🤑 / 💴💴
    }
}
let Conversor = Convertidor()
print("¿Que tipo de conversion quieres realizar?")
print("1. Pesos a Dolar")
print("2. Pesos a Euros")
print("3. Pesos a Yenes")
var opcion = Int(readLine()!) ?? 0
switch opcion{
    case 1:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.🤑🤑 = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosADolares())")
        case 2:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.🤑🤑 = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosAEuros())")
        case 3:
        print("Introduce la cantidad de pesos a convertir")
        Conversor.🤑🤑 = Float(readLine()!) ?? 0
        print("El resultado de la conversion es: \(Conversor.convertirPesosAYen())")
        default:
        print("Introduce una opcion valida")
}