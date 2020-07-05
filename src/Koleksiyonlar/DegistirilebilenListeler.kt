package Koleksiyonlar


fun main() {
    //mutablelistof arraylistof

    var degisebilenListe = ArrayList<Int>(50) // initialCapacity zorunlu değil

    var arrayListOfListesi = arrayListOf("emre","hasan",3,null,false)
    var arrayListOfListesi2 = mutableListOf("emre","hasan",3,null,false)



    //ekleme
    arrayListOfListesi.add("ali")
    arrayListOfListesi.add(null)
    arrayListOfListesi.add(9.8)

    for (oankiEleman in arrayListOfListesi){
        println(oankiEleman)
    }

    //güncelleme
    arrayListOfListesi.set(1,"yeni hasan")


    for (oankiEleman in arrayListOfListesi){
        println(oankiEleman)
    }

    //sil
    arrayListOfListesi.remove("yeni hasan")

    for (oankiEleman in arrayListOfListesi){
        println(oankiEleman)
    }

    arrayListOfListesi.removeAt(0)


    println("**********************************")
    for (oankiEleman in arrayListOfListesi){
        println(oankiEleman)
    }

    println("size : "+arrayListOfListesi.size)

}
