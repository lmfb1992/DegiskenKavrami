package Kalitim

open class Calisan {

    open var pozisyon : String = "Çalışan"
    open fun calis(){
        println("$pozisyon çalışmaya başladı")

    }
}

class Mudur: Calisan(){
    override var pozisyon: String = "Müdür"


    override fun calis(){
        println("$pozisyon çalışmaya başladı ")

    }

}
class Programci: Calisan(){
    override var pozisyon: String = "Programci"


    override fun calis(){
        println("$pozisyon çalışmaya başladı ")

    }

}
class Pazarlamaci: Calisan(){
    override var pozisyon: String = "Pazarlamaci"


    override fun calis(){
        println("$pozisyon çalışmaya başladı ")

    }

}

fun main() {

/*
    var calisanlar = Array<Any>(4){Any()}

    calisanlar[0] = Calisan()//yukarı çevrim upcasting
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()*/

    var calisanlar = Array<Calisan>(4){ Calisan() }

    calisanlar[0] = Calisan()//yukarı çevrim upcasting
    calisanlar[1] = Mudur()
    calisanlar[2] = Programci()
    calisanlar[3] = Pazarlamaci()

    //mesaiyeBasla(calisanlar)
    mesaiyeBaslaPolimorfizm(calisanlar)


}

fun mesaiyeBasla(calisanlar: Array<Any>) {
    for (oankiCalisan in calisanlar){

       if (oankiCalisan is Calisan){
            var calisan:Calisan = oankiCalisan
            calisan.calis()

        }else if(oankiCalisan is Mudur){
            var mudur:Mudur = oankiCalisan
            mudur.calis()
        }
        else if (oankiCalisan is Programci){
            var programci : Programci = oankiCalisan
            programci.calis()
        }else if (oankiCalisan is Pazarlamaci){
            var pazarlamaci: Pazarlamaci = oankiCalisan
            pazarlamaci.calis()
        }

    }

}

fun mesaiyeBaslaPolimorfizm(calisanlar: Array<Calisan>){


    for (oankiCalisan in calisanlar){
        oankiCalisan.calis()
    }
}
