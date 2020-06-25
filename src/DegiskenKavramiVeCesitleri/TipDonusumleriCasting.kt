package DegiskenKavramiVeCesitleri

fun main() {

    var shortSayi: Short = 32767

    var intSayi : Int

    intSayi = shortSayi.toInt()

    println(intSayi)

    var intSayi2 : Int = 45000

    var shortSayi2 : Short

    shortSayi2 = intSayi2.toShort()

    println(shortSayi2)


    var noktaliSayi : Double  = 50.556677

    var noktaliSayitoInt: Int

    noktaliSayitoInt = noktaliSayi.toInt()

    println(noktaliSayitoInt)

    var buyukSayi = 5965623L

    var s1 : Int = buyukSayi.toInt()

    var buyukOndalikliSayi = 8555.9666F

    var d1:Double = buyukOndalikliSayi.toDouble()

    var sayi1 = 8555
    println(sayi1+1)

    println(sayi1.toString()+1)


}