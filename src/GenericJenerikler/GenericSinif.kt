package GenericJenerikler


class StringDiziYaz{

    fun diziYazdir(dizi:Array<String>){
        for ( gecici in dizi){
            println(gecici)
        }
    }
}


class IntegerDiziYaz{

    fun diziYazdir(dizi:Array<Int>){
        for ( gecici in dizi){
            println(gecici)
        }
    }
}


class GenericDiziYaz<Genel>(var dizi: Array<Genel>){

    fun diziYazdir(){

        for (gecici in dizi){
            println(gecici)
        }
    }


}

fun main() {
    var stringDizi = arrayOf("emre","hasan","ali")
    var integerDizi = arrayOf(1,2,3)

    var stringDiziYazSinif = StringDiziYaz()
    stringDiziYazSinif.diziYazdir(stringDizi)

    var integerDiziYazSinif = IntegerDiziYaz()
    integerDiziYazSinif.diziYazdir(integerDizi)

    var genericYazSinif = GenericDiziYaz(stringDizi)
    genericYazSinif.diziYazdir()
}