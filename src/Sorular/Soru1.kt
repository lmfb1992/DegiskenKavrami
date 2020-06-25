package Sorular

fun main() {

    var sayilar = arrayOfNulls<Int>(3)
    var ort: Double = 0.0


    for (i in 0..sayilar.size-1){
        println("${i+1} . sayıyı giriniz.")
        sayilar[i] = readLine()?.toInt()
        ort+= sayilar[i]!!

    }
    ort/=sayilar.size
    println(ort)








}