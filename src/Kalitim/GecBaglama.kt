package Kalitim

open class Hayvan {
    open fun avYakala(){
        println("Hayvan av yakala çalıştı.")

    }
}

class Kartal:Hayvan(){

    override fun avYakala() {
        println("Kartal av yakala çalıştı.")
    }


}
class Timsah:Hayvan(){

    override fun avYakala() {
        println("Timsah av yakala çalıştı.")
    }


}

fun main() {

    var hayvanlar = Array<Hayvan>(3){Hayvan()}

    for (i in 0 until hayvanlar.size-1){
        hayvanlar[i]= rastgeleSec()
    }
    for (hayvan in hayvanlar){
        hayvan.avYakala()
    }

}

fun rastgeleSec(): Hayvan {
    var rastgeleSayi = (Math.random()*3).toInt()
    var oankiHayvan = Hayvan()

    when(rastgeleSayi){
        0-> oankiHayvan= Hayvan()
        1->oankiHayvan = Kartal()
        2-> oankiHayvan = Timsah()


    }

    return oankiHayvan
}
