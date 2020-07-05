package OzelFonksiyonlar

class TestLambda{

    fun ikiSayiyiTopla(sayi1:Int,sayi2:Int,action:(Int,Int)-> Int){
        val toplam = action(sayi1,sayi2)
        println(toplam)


    }
    fun terstenYaz(yazi:String,myFunc : (String) -> String){

        var terstenYazi = myFunc(yazi)
        println(terstenYazi)

    }
}

fun main() {

    var nesne = TestLambda()
    var lambdaFonksiyon = {a:Int,b:Int -> a+b}
    nesne.ikiSayiyiTopla(9,12,lambdaFonksiyon)
    nesne.ikiSayiyiTopla(9,12,{a:Int,b:Int -> a+b})
    nesne.ikiSayiyiTopla(9,12){a:Int,b:Int -> a+b}

    var lambdaFonkString = {yazi:String -> yazi.reversed()}
    nesne.terstenYaz("merhaba",lambdaFonkString)
    nesne.terstenYaz("merhaba",{yazi:String -> yazi.reversed()})
    nesne.terstenYaz("merhaba"){yazi:String -> yazi.reversed()}
    nesne.terstenYaz("merhaba"){it.reversed()} // tek parametreli fonksiyonlar için
}