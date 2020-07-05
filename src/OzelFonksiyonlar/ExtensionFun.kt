package OzelFonksiyonlar

fun main() {

    println("Normal faktoriyel 5! " + faktoriyelBul(5))
    println("Normal faktoriyel 8! " + 8.faktoriyelBulExt())

    var yazi = "Emre                                       altunbilek\t Kotlin"
    println(yazi)
    println("düzenlenmiş hali : "+yazi.boslukDuzenle())

    var emre = Ogr()
    emre.yetenek="Kotlin"
    emre.yetenekYazdir()

    var hasan = Ogr()
    hasan.yetenek = "Android"
    hasan.yetenekYazdir()

    var ali:Ogr = emre.yetenekBirlestir(hasan)
    ali.yetenekYazdir()

    var can:Ogr = ali yetenekBirlestir hasan
    can.yetenekYazdir()


}

fun faktoriyelBul(sayi : Int):Int{

    var sonuc = 1

    for (i in 1..sayi){
        sonuc = sonuc*i
    }
    return sonuc

}
fun Int.faktoriyelBulExt():Int{
    var sonuc = 1

    for (i in 1..this){
        sonuc = sonuc*i
    }
    return sonuc

}
fun String.boslukDuzenle():String{

    var regex = Regex("\\s+")

    return regex.replace(this," ")


}
infix fun Ogr.yetenekBirlestir(hasan :Ogr):Ogr{

    var olusturulanOgrNesnesi = Ogr()
    olusturulanOgrNesnesi.yetenek = this.yetenek+" "+hasan.yetenek
    return olusturulanOgrNesnesi

}

