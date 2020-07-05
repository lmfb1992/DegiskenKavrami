package AbstractveInterface


class DisSinif{

    var sinifAdi = "Dış Sınıf"
    fun selamVerDisSinif(){

        println("Dış sınıftan merhaba")
    }
    inner class IcSinif{
        var sinifAdi = "İç Sınıf"
        fun selamVerIcSinif(){
            selamVerDisSinif()
            println("İç sınıftan merhaba")
        }

        inner class EnIctekiSinif{
            fun enictekiMethod(){
                selamVerDisSinif()
                selamVerIcSinif()
                println("en içteki sınıftan meryhaba")
            }
        }
    }


}

fun main() {
    var disSinif = DisSinif()
    println(disSinif.sinifAdi)
    disSinif.selamVerDisSinif()

    var icSinif = DisSinif().IcSinif()
    println(icSinif.sinifAdi)
    icSinif.selamVerIcSinif()

    var enictekisinif = DisSinif().IcSinif().EnIctekiSinif()
    enictekisinif.enictekiMethod()

}