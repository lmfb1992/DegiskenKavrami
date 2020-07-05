package Koleksiyonlar


//List
//mutable immutable

//immutable : listOf() veya listOfNotNull()


fun main() {
    var listOfListesi = listOf(2,3,"emre",true,null,5.4) //listOf() --> içindeki değerler değiştirilemez.

    for (oankiEleman in listOfListesi){
        println(oankiEleman)
    }

    println(listOfListesi.get(3))
    println(listOfListesi[3])


    var s1 = listOfListesi.get(0) as Int // veri türünü belli edioruz "as" ile
    var s2 = listOfListesi.get(1) as Int

    println(s1+s2)
    println(listOfListesi.size)


    var listOfNotNullListesi = listOfNotNull(2,3,"emre",true,null,5.4)

    println(listOfNotNullListesi.size)

}


