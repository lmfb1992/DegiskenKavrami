package IstisnaExceptionKavrami

import java.lang.ArithmeticException
import java.lang.Exception


fun main() {


    var dizi = Array<Int>(3){0}
    dizi[0] = 0
    dizi[1] =1
    dizi[2] =2

    try {
        istisna1(dizi)
    }catch (hata:Exception){
        println("Hata : "+hata.toString())
    }



    /*try {
        for (i in 0..3){
            println("Sayı : "+dizi[i])
            var bolum = 9/0
        }
    }catch (hataNesnesi :ArrayIndexOutOfBoundsException){
        println("Hata oluştu : "+hataNesnesi.toString())
    }catch (hataNesnesi : ArithmeticException){
        println("Hata oluştu : "+hataNesnesi.toString())
    }*/

    println("Main metotu sonlandı")


}

fun istisna1(dizi: Array<Int>) {
    println("istisna1 başladı")

    /*try {
        istisna2(dizi)
    }catch (hata:Exception){
        println("Hata : "+hata.toString())
    }*/
    istisna2(dizi)


    println("istisna1 bitti")
}

fun istisna2(dizi: Array<Int>) {

    println("istisna2 başladı")

    /*try {
        for (i in 0..3){
            println("Sayı : "+dizi[i])

        }
    }catch (hata : Exception){
        println("Hata : "+hata.toString())
    }*/
    for (i in 0..3){
        println("Sayı : "+dizi[i])

    }


    println("istisna2 bitti")
}
