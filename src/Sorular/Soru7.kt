package Sorular

fun main() {

    var toplam : Int = 1
    println("faktöriyelini almak istediğiniz sayıyı giriniz : ")
    var faktoriyel = readLine()!!.toInt()


    for (i in faktoriyel!!.downTo(1) ){

        toplam = toplam * i
    }

    println(toplam)

}