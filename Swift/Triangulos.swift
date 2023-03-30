import Swift
import Foundation

class Triangulos {
    var x1: Double
    var x2: Double
    var x3: Double
    var y1: Double
    var y2: Double
    var y3: Double
    
    init(x1: Double, x2: Double, x3: Double, y1: Double, y2: Double, y3: Double) {
        self.x1 = x1
        self.x2 = x2
        self.x3 = x3
        self.y1 = y1
        self.y2 = y2
        self.y3 = y3
    }
    
    func area() -> Double {
        let a = sqrt(pow(x2-x1,2)+pow(y2-y1,2))
        let b = sqrt(pow(x3-x2,2)+pow(y3-y2,2))
        let c = sqrt(pow(x3-x1,2)+pow(y3-y1,2))
        let s = (a+b+c)/2
        return sqrt(s*(s-a)*(s-b)*(s-c))
    }
}

let tri = Triangulos(x1: 11, x2: 5, x3: 50, y1: 22, y2: 10, y3: 20)
print(tri.area())
