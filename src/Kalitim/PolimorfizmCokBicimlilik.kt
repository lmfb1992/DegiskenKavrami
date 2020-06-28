package Kalitim

open class Asker {

    open fun selamVer(){
        println("Asker selam verdi.")
    }
}
class Er : Asker(){

    override fun selamVer() {
        println("Er selam verdi.")
    }

}
class Yuzbasi : Asker(){

    override fun selamVer() {
        println("Yüzbaşı selam verdi.")
    }

}

fun main() {

    var asker = Asker()
    var er = Er()
    var yuzbasi = Yuzbasi()
    hazirOl(asker)
    hazirOl(er)
    hazirOl(yuzbasi)


}

fun hazirOl(asker:Asker){

    asker.selamVer()

}

