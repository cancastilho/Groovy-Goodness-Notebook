class Size {
    def x, y

    Object asType(Class clazz) {
        if (clazz == SquaredSize) {
            new SquaredSize(x: x**2, y: y**2)
        }
    }
}

class SquaredSize {
    def x, y

    String toString() { "x: $x, y: $y" }
}

def size = new Size(x: 10, y: 5)
def squared = size as SquaredSize  // Or size.asType(SquaredSize)

assert squared.toString() == 'x: 100, y: 25'
assert squared.x == 100
assert squared.y == 25
