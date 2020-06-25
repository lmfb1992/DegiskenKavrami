package Array

import java.util.*

fun main() {

    //Dizi Kopyalama
    var dizi1 = arrayOf(5,1,3,90,4)
    var dizi2 = Array<Int>(5){0}

    System.arraycopy(dizi1,0,dizi2,0,dizi1.size)

    for (sayi in dizi2){
        println(sayi)
    }

    //Dizi Sıralama

    println("**************************")
    Arrays.sort(dizi2)

    for (sayi in dizi2){
        println(sayi)
    }

    //Dizi Karşılaştırma

    println(Arrays.equals(dizi1,dizi2))


}