package DegiskenKavramiVeCesitleri

fun main() {

    var isTrue : Boolean = 5>4
    println("istrue değişkeninin değeri "+ isTrue)

    var ilkHarf : Char = 'a'
    var ikinciHarf : Char = 'b'
    println("ilk harf : "+ilkHarf+" ikinci harf : $ikinciHarf")


    var isim :String  = "Berk Kılıç"
    println("Benim adım : $isim" + " ve adımdaki karakter sayısı : "+isim.length)
    println(isim.get(5))

    println("""Kotlindeki \n işareti bir alt satıra geçmeyi sağlar.""")// \n i metin olarak kullanmak istiyorsak 3 tırnak içerisinde yazmamız gerekir.

}