import Swift
var cadena,subcadena: String
print("Mete la cadena pa")
cadena = readLine()!
let indice = cadena.index(cadena.startIndex, offsetBy: 2)
subcadena = String(cadena[..<indice])
let cadenaNumero = Int(subcadena)
