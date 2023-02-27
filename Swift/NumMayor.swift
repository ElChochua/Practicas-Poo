/*Escribir un programa que calcule y visualice el más grande y más pequeño de N números capturados. El valor de N se solicitará al principio del programa y 
los numeros seran introducidos por el usuario.*/
// Numero N:🔢  Arreglo:🔛 Numero que se introduce al arreglo:👨‍👨‍👦‍👦  Numero menor: 🥺 Numero mayor: 🤑 Numero de iteraciones: 🤐
import Swift
func obtenerMayorYMenorNumeros(cantidadNumeros: Int) -> (mayor: Int, menor: Int) {
    var 🔢 = cantidadNumeros
    var 🔛 = [Int](repeating: 0, count: 🔢)
    print("Introduzca un numero: ", terminator: "")
    var 👨‍👨‍👦‍👦 = Int(readLine()!)!
    🔛[0] = 👨‍👨‍👦‍👦
    var 🥺 = 👨‍👨‍👦‍👦
    var 🤑 = 👨‍👨‍👦‍👦
    for 🤐 in 1..<🔢 {
        print("Introduzca un numero: ", terminator: "")
        👨‍👨‍👦‍👦 = Int(readLine()!)!
        if 👨‍👨‍👦‍👦 < 🥺 {
            🥺 = 👨‍👨‍👦‍👦
        }
        🔛[🤐] = 👨‍👨‍👦‍👦
        if 👨‍👨‍👦‍👦 > 🤑 {
            🤑 = 👨‍👨‍👦‍👦
        }
    }
    return (mayor: 🤑, menor: 🥺)
}
print("Introduzca la cantidad de numeros a ingresar: ", terminator: "")
var 🔢 = Int(readLine()!)!
var (mayor, menor) = obtenerMayorYMenorNumeros(cantidadNumeros: 🔢)
print("El numero mayor es: \(mayor)")
print("El numero menor es: \(menor)")



