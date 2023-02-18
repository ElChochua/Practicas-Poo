import Swift
var Matriz = [[Int]]( repeating: [Int]( repeating: 0, count: 3 ), count: 3 )
var num,mayor,posicioni,posicionj:Int
mayor = 0
posicioni = 0
posicionj = 0
for i in 0..<3 {
    for j in 0..<3{
        print("Introduce un numero en la posicion [\(i)][\(j)]: ")
        num = Int(readLine()!) ?? 0
        Matriz[i][j] = num
        if num > mayor{
            mayor = num
            posicioni = i
            posicionj = j
        }
    }
}
print("La matriz es: ")
for i in 0..<3 {   
    for j in 0..<3{
        print("\(Matriz[i][j])", terminator: " ")
    }
    print("")
}
print("El numero mayor es: \(mayor) y se encuentra en la posicion:  [\(posicioni)][\(posicionj)] ")
