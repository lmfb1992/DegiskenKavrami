package FonksiyonlarVeMethodlar


//veri dönüş tipine göre method aşırı yüklemesi overloading yapılamaz.

fun main() {
    toplaminiBul(4,5)
    toplaminiBul(4,5,2)
    toplaminiBul(4.2,5.3)
    toplaminiBul(1,2,3,4,5,6,7,8)

    var sayilarDizi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    toplaminiBul(sayilarDizi)




}

fun toplaminiBul(sayilarDizi: Array<Int>) {

    var toplam =0
    for (sayi in sayilarDizi){
        toplam+=sayi
    }
    println(toplam)
}

fun toplaminiBul(sayi1:Int, sayi2:Int){
    println(sayi1+sayi2)
}
fun toplaminiBul(sayi1:Double,sayi2:Double){
    println(sayi1+sayi2)

}

fun toplaminiBul(sayi1: Int, sayi2: Int, sayi3: Int) {
    println(sayi1+sayi2+sayi3)

}

fun toplaminiBul(vararg sayilar:Int){

    var toplam=0
    for (i in sayilar){
        toplam+=i

    }
    println(toplam)
}
