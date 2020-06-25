package diziRangeInKavramlari

fun main() {

    println("isminizi giriniz : ")
    var isim : String? = readLine()
    println("soyadınızı giriniz : ")
    var soyisim : String = readLine()!!

    println("yaşınızı girin: ")
    var yas = readLine()!!.toInt()

    println("ad : $isim soyad: $soyisim yas: $yas")
}