import Swift
//😂😂 Numero decimal ingresado 😎 cociente de las operaciones 😁 contador del ciclo 🐱‍👓 Arreglo donde se almacena el numero binario
var 😂😂, 😎,😁: Int
var 🐱‍👓 :[Int]
🐱‍👓 = [Int](repeating: 0, count: 10)
😁=0
print("Introduzca un numero decimal: ")
😂😂 = Int(readLine()!) ?? 0
repeat{
    😎 = 😂😂/2
    🐱‍👓[😁] = 😂😂%2
    😂😂 = 😎
    😁 += 1
}while 😎 > 0
//Imprimimos el arreglo de forma inversa
🐱‍👓.reverse()
print(🐱‍👓)