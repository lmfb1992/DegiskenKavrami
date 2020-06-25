package Sorular

fun main() {

    var dizi = arrayOfNulls<Int>(10)
    var toplam =1

    for (i in 0..dizi.size-1){
       if (i==0 || i==1){
           toplam=1
           dizi[i] = toplam
       }else{
           toplam = toplam*i
           dizi[i] = toplam
       }
        println(dizi[i])
    }





}