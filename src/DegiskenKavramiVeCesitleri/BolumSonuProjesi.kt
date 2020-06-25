package DegiskenKavramiVeCesitleri

fun main() {

    //ilgili değerler değişkenlere atandı
    val isim:String = "Emre"
    val soyisim:String = "Altunbilek"


    var yas:Byte = 29
    var kilo:Double = 81.4
    var boy: Double = 1.78
    val cinsiyet : Char = 'E'


    //boy kilo endex hesaplama
    var boyDegerininKaresi : Double = boy*boy
    var boyKiloEndex : Double = kilo/boyDegerininKaresi

    //bilgi mesajlarının yazılması
    println("Adın : "+ isim+" Soyadı: "+soyisim)
    println("Yaş : $yas Cinsiyet : $cinsiyet")
    println("Kilo : $kilo Boy : $boy")
    println("Boy kilo Endeksiniz : "+boyKiloEndex)


}