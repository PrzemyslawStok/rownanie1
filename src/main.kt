fun main(){
    var a = 1.0
    var b = 5.0
    var c = 2.0

    println("Program rozwiązuje równanie kwadratowe w postaci: ax^2+bx+c=0")

    print("Wprowadź a:")
    a = readLine()!!.toDouble()

    print("Wprowadź b:")
    b = readLine()!!.toDouble()

    print("Wprowadź c:")
    c = readLine()!!.toDouble()

    val rownanie = RownanieKwadratowe(a,b,c)

    rownanie.wyswietlRownanie()
    rownanie.wyswietlRozwiazania()
}