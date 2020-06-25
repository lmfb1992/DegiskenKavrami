package Sorular

fun main() {
    println("dizi kaç elemanlı olsun")
    var eleman = readLine()!!.toInt()
    var dizi = arrayOfNulls<Int>(eleman)
    var toplam =0

    for(i in 0..dizi.size-1){
        println("${i+1}. elemanı girin : ")
        dizi[i] = readLine()!!.toInt()
        toplam += dizi[i]!!


    }
    println(toplam)




}