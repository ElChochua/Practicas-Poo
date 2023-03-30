import Swift

//💴💴Yenes 🤑🤑Pesos 💵Dolares 💶Euros
class Convertidor {
    public var 🤑🤑: Float
    internal var 💵💵: Float
    internal var 💶💶: Float
    internal var 💴💴: Float
    
    init() {
        💵💵 = 18.71
        💶💶 = 19.90
        💴💴 = 0.14
        self.🤑🤑 = 0
    }
    
    func convertir(monedasAConvertir: Float, aMoneda: String) -> Float {
        switch aMoneda {
        case "Dolares":
            return monedasAConvertir / 💵💵
        case "Euros":
            return monedasAConvertir / 💶💶
        case "Yenes":
            return monedasAConvertir / 💴💴
        default:
            print("Introduce una moneda valida")
            return 0
        }
    }
}

let Conversor = Convertidor()

print("¿Que tipo de conversion quieres realizar?")
print("1. Pesos a Dolar")
print("2. Pesos a Euros")
print("3. Pesos a Yenes")

var opcion = Int(readLine()!) ?? 0

print("Introduce la cantidad de pesos a convertir")
Conversor.🤑🤑 = Float(readLine()!) ?? 0

switch opcion {
case 1:
    print("El resultado de la conversion es: \(Conversor.convertir(monedasAConvertir: Conversor.🤑🤑, aMoneda: "Dolares"))")
case 2:
    print("El resultado de la conversion es: \(Conversor.convertir(monedasAConvertir: Conversor.🤑🤑, aMoneda: "Euros"))")
case 3:
    print("El resultado de la conversion es: \(Conversor.convertir(monedasAConvertir: Conversor.🤑🤑, aMoneda: "Yenes"))")
default:
    print("Introduce una opcion valida")
}
