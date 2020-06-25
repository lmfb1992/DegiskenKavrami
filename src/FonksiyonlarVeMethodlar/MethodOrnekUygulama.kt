package FonksiyonlarVeMethodlar




fun main() {


    while (true){
        var kullaniciSecimi = menuGosterMehhod()

        if (kullaniciSecimi==5){
            break
        }
        var sayi1:Int = 0
        var sayi2:Int = 0
        if (kullaniciSecimi in 1..4) {
            println("birinci sayıyı giriniz:")
             sayi1 = readLine()!!.toInt()
            println("ikinci sayıyı giriniz : ")
             sayi2 = readLine()!!.toInt()

        }
        when(kullaniciSecimi){
            1-> toplamaYap(sayi1,sayi2)
            2-> cikarmaYap(sayi1,sayi2)
            3-> carpmaYap(sayi1,sayi2)
            4-> bolmeYap(sayi1.toDouble(), sayi2.toDouble())
            else -> {
                println("hatalı giriş")
            }
        }

    }

}

fun bolmeYap(sayi1: Double, sayi2: Double) {
    println("sayiların bölümü : "+(sayi1/sayi2))

}

fun carpmaYap(sayi1: Int, sayi2: Int) {

    println("sayiların çarpımı : "+(sayi1*sayi2))
}

fun cikarmaYap(sayi1: Int, sayi2: Int) {

    println("sayiların farkı : "+(sayi1-sayi2))
}

fun toplamaYap(sayi1: Int, sayi2: Int) {

    println("sayiların toplamı : "+(sayi1+sayi2))
}

fun menuGosterMehhod() : Int{

    println("*********** menu ***********")
    println("1- topla")
    println("2- çikar")
    println("3- Çarpma")
    println("4- Böl")
    println("5- Çıkış")

    var secim : Int = readLine()!!.toInt()

    return secim
}