package OzelFonksiyonlar

class Person{
    var ad:String=""
    var yas:Int = -1

    fun kendiniTanit(){
        println("Merhaba ben $ad ve $yas yaşındayım.")
    }

}

fun main() {
    var kisi = Person()
    /*kisi.ad="Emre"
    kisi.yas = 30
    kisi.kendiniTanit()*/

    with(kisi){
        ad = "Emre"
        yas = 30
    }
    kisi.kendiniTanit()

    kisi.apply {
        ad="hasan"
        yas=40

    }.kendiniTanit()
}

