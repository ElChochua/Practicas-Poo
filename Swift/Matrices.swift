import Swift
//Num:😗😗 Mayor:🤩🤩 Posicioni:👉👉 Posicionj:👈👈 i:🙌🙌 j:🙏🙏 Matriz:🏢
var 🏢 = [[Int]]( repeating: [Int]( repeating: 0, count: 3 ), count: 3 )
var 😗😗,🤩🤩,👈👈,👉👉:Int
🤩🤩 = 0
👈👈 = 0
👉👉 = 0
for 🙌🙌 in 0..<3 {
    for 🙏🙏 in 0..<3{
        print("Introduce un numero en la posicion [\(🙌🙌)][\(🙏🙏)]: ")
        😗😗 = Int(readLine()!) ?? 0
        🏢[🙌🙌][🙏🙏] = 😗😗
        if 😗😗 > 🤩🤩{
            🤩🤩 = 😗😗
            👈👈 = 🙌🙌
            👉👉 = 🙏🙏
        }
    }
}
print("La Matriz es: ")
for 🙌🙌 in 0..<3 {   
    for 🙏🙏 in 0..<3{
        print("\(🏢[🙌🙌][🙏🙏])", terminator: " ")
    }
    print("")
}
print("El numero Mayor es: \(🤩🤩) y se encuentra en la posicion:  [\(👈👈)][\(👉👉)] ")
