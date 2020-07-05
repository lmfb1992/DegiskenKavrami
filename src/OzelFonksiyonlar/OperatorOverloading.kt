package OzelFonksiyonlar

class Baslik(var deger:String)


fun main() {

    var isim = "Emre"

    var soyisim = " Altunbilek"
    var tamad = isim + soyisim

    var tamad2 = isim.plus(soyisim)
    println(tamad)
    println(tamad2)

    val b1 = Baslik("Başlık 1")
    val b2 = Baslik("Başlık 2")

    val b3 = b1.plus(b2)
    val b4 = b1 plus b2
    var b5 = b1 + b2
    println(b3.deger)
    println(b4.deger)
    println(b5.deger)

}

operator infix fun Baslik.plus(b2:Baslik):Baslik{
    var geciciBaslik = Baslik(this.deger+" "+b2.deger)
    return geciciBaslik
}


