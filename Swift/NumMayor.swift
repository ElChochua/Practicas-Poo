/*Escribir un programa que calcule y visualice el más grande y más pequeño de N números capturados. El valor de N se solicitará al principio del programa y 
los numeros seran introducidos por el usuario.*/
import Swift
print("Introduzca la cantidad de numeros a ingresar: ", terminator: "")
var numN = Int(readLine()!)!
var arreglo = [Int](repeating: 0, count: numN)
print("Introduzca un numero: ", terminator: "")
var num = Int(readLine()!)!
arreglo[0] = num
var men = num
var may = num
for i in 1..<numN {
    print("Introduzca un numero: ", terminator: "")
    num = Int(readLine()!)!
    if num < men {
        men = num
    }
    arreglo[i] = num
    if num > may {
        may = num
    }
}
print("El numero mayor es: \(may)")
print("El numero menor es : \(men)")

