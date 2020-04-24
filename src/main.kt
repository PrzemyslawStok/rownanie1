fun main(){
    var a = 1.0
    var b = 5.0
    var c = 2.0

    println("Program rozwiązuje równanie kwadratowe w postaci: ax^2+bx+c=0")
    print("Wprowadź a:")

    a = readLine()!!.toDouble()

    RownanieKwadratowe(a,b,c).wyswietlRownanie()
}