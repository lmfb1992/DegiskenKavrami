package operatorler

fun main() {


    //mühendis ve 30 yaşında küçük olmalı

    var sart1 = true
    var sart2 = false

    println(sart1 && sart2)

    //and işleminde tüm koşullarda true olmalı aksi taktirde sonuç false olur.

    //or (veya)

    //35 yaşından küçük olsun veya doktor

    var sart3 = true
    var sart4 = false

    println(sart3 || sart4)

    //or işleminde tüm koşullar false ise sonuç false olur aksi taktirde true olur.

    //Değil (Not)

    var sart5 = true
    println(!sart5)


    //ARTTIRMA VE AZALTMA

    // ++ sayı veya değişkeni 1 arttırır.
    // -- sayı veya değişkeni 1 azaltır.

    var sayi =16

    //sayi=sayi+1
    //sayi+=1
    //sayi++
    println(++sayi)

    var sayi2 = 22

    println(sayi2--)
    println(sayi2)

    println(--sayi2)
    println(sayi2)




}