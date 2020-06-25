package operatorler

fun main() {

    // () -> parantez içi
    // ++ ve -- değişken önce
    // ^
    // * ve /
    // + ve -
    // = atama
    // ++ ve -- değişken sonra sayi++

    var sayi1 = 15
    var sayi2 = 5
    var sonuc:Int

    sonuc = (sayi1+sayi2*2-sayi2)+sayi2-sayi1*5+sayi2
    println(sonuc)
    sonuc =0

    sonuc = (sayi1*sayi2+4/2)+sayi1++ * sayi2
    println(sonuc)

}