fun main(){
    var a : Double
    var b : Double
    var c : Double

    println("Program rozwiązuje równanie kwadratowe w postaci: ax^2+bx+c=0")

    print("Wprowadź a:")
    a = readLine1(10.0)

    print("Wprowadź b:")
    b = readLine1(10.0)

    print("Wprowadź c:")
    c = readLine1(10.0)

    val rownanie = RownanieKwadratowe(a,b,c)

    rownanie.wyswietlRownanie()
    rownanie.wyswietlRozwiazania()
}

fun readLine1(defaultValue: Double):Double{
    var a: Double

    try {
        a = readLine()!!.toDouble()
    }catch(e:NumberFormatException){
        println("Użyto wartości domyślnej: ${defaultValue}")
        a = defaultValue
    }

    return a
}

