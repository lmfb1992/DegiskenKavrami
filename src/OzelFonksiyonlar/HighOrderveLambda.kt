package OzelFonksiyonlar

fun main() {

    var nesne = Topla()
    nesne.ikiSayiyiTopla(3,5) // normal yol


    /*var interfaceNesne= Test()
    nesne.ikiSayiyiTopla(6,10,interfaceNesne)*/

    nesne.ikiSayiyiTopla(6,10,object:ToplamGosteren{
        override fun toplamGosteren(toplam: Int) {
            println(toplam)         //interface kullanılarak
        }

    })

    var isim :String    = "emre"




    var lambdaExpression ={sayi:Int -> println(sayi)} //lambda expression, isimsiz fonksiyon, sayi:parametre -> fonksiyon gövdesi gelir.
    nesne.ikiSayiyiTopla(9,15,lambdaExpression)
    nesne.ikiSayiyiTopla(9,15,{sayi:Int -> println(sayi)})


}

class Topla{
    fun ikiSayiyiTopla(a:Int,b:Int){
        val toplam = a+b
        println(toplam)
    }
    fun ikiSayiyiTopla(a:Int,b:Int,action:ToplamGosteren){
        val toplam = a+b
        action.toplamGosteren(toplam)
    }

    fun ikiSayiyiTopla(a:Int,b:Int,action:(Int) -> Unit){

        val toplam = a+b
        action(toplam)
    }



}

interface ToplamGosteren{

    fun toplamGosteren(toplam:Int)

}

class Test:ToplamGosteren{
    override fun toplamGosteren(toplam: Int) {
        println(toplam)
    }

}
