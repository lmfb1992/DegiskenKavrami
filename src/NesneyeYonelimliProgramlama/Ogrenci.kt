package NesneyeYonelimliProgramlama

class Ogrenci ( isim:String,  yas: Int) {
    var gelenIsim :String
    var gelenYas : Int

    init {
        this.gelenIsim = isim
        this.gelenYas = yas
        println("Init bloğu çalıştı.")
        println("Isim : $isim Yas : $yas")
    }


    fun bilgileriGoster (){
        println("Isim : $gelenIsim Yas : $gelenYas")

    }
}

fun main() {
    var ogr1: Ogrenci = Ogrenci("emre",29)
    ogr1.bilgileriGoster()



}