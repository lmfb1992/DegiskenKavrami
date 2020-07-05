package OzelFonksiyonlar

import java.util.function.Consumer

/*
* High Level Functions
*  - parametre olarak fonksiyon alan fonksiyondur.
*  - geriye fonksiyon da döndürebilir
* veya ikisini de yapabilir.
* */

fun main() {

    var sayilar = listOf<Int>(1,2,3,4,5,6)

    /*for (sayi in sayilar){
        println(sayi)

    }*/
   // sayilar.forEach({ println(it)})

   /* var consumer : Consumer<Int> = object :Consumer<Int>{
        override fun accept(t: Int) {
            println(t)
        }

    }
    sayilar.forEach(consumer)*/

    //sayilar.forEach({sayi -> println(sayi)})
    sayilar.forEach({ println(it)})

}