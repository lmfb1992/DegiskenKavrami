package Sorular

fun main() {

    var dizi = arrayOfNulls<Int>(5)
    for (i in 0..dizi.size-1){
        println("${i+1} . sayıyı giriniz : ")
        dizi[i] = readLine()!!.toInt()
    }

    for (i in dizi){
        println(i)
    }

}