fun main(){
    var a : Double?
    var b : Double?
    var c : Double?

    a = null

    println("Program rozwiązuje równanie kwadratowe w postaci: ax^2+bx+c=0")

    print("Wprowadź a:")
    a = readLine()?.toDouble()

    print("Wprowadź b:")
    b = readLine()?.toDouble()

    print("Wprowadź c:")
    c = readLine()?.toDouble()

    var d: Double
    d=a?:10.0

    val rownanie = RownanieKwadratowe(a,b,c)

    //rownanie.wyswietlRownanie()
    //rownanie.wyswietlRozwiazania()
}