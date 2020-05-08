import kotlin.math.sqrt

class RownanieKwadratowe(val a: Double, val b: Double, val c: Double) {
    val delta: Double

    var x0 = 0.0
    var x1 = 0.0
    var x2 = 0.0

    var x1i = 0.0
    var x2i = 0.0

    fun wyswietlRownanie(){
        println("Równanie: ${a}x^2+${b}x+${c}=0")
    }

    fun obliczDelte(): Double {
        return b * b - 4 * a * c
    }

    fun obliczDwaRozwiazania() {
        x1 = (-b + sqrt(delta)) / (2 * a)
        x2 = (-b - sqrt(delta)) / (2 * a)
    }

    fun obliczDwaRozwiazaniaZespolone(){

        x1 = -b/ (2 * a)
        x2 = -b/ (2 * a)

        x1i = + sqrt(-delta) / (2 * a)
        x2i = - sqrt(-delta) / (2 * a)
    }

    fun obliczJednoRozwiazanie() {
        x0 = -b / (2 * a)
    }

    fun wyswietlRozwiazania(){
        if (delta > 0) {
            println("Mamy dwa rozwiązania:")
            println("x1=${x1}")
            println("x2=${x2}")
        }
        if (delta == 0.0) {
            println("Mamy jedno rowziązanie:")
            println("x0=${x0}")
        }
        if (delta < 0) {
            println("Równanie nie posiada rozwiązań w zbiorze liczb rzeczywistych")

            println("x1=${x1}$+${x1i}i")

            if(x2i>=0)
                println("x2=${x2}+${x2i}i")
            else
                println("x2=${x2}${x2i}i")
        }
    }

    fun deltaInfo() {
        if (delta > 0)
            println("Delta jest większa od zero")
        if (delta == 0.0)
            println("Delta wynosi zero")
        if (delta < 0)
            println("Delta jest mniejsza od zero")
    }

    fun oblicz() {
        if (delta > 0)
            obliczDwaRozwiazania()
        if (delta == 0.0)
            obliczJednoRozwiazanie()
        if (delta < 0)
            obliczDwaRozwiazaniaZespolone()
    }

    init {
        delta = obliczDelte()
        oblicz()
    }
}