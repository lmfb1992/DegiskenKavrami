package AbstractveInterface

interface Hayvan {

     fun avlan()
     fun interfaceTest(){
         println("interface metodu")
     }

}


abstract class Kedigiller : Hayvan{

    abstract fun takipEt()

}

open class Kedi: Kedigiller() {


    override fun takipEt() {
        println("Kedi sınıfı takipet çalıştı.")
    }

    override fun avlan() {

    }


}

class Kaplan : Kedi(){
    override fun takipEt() {
        println("Kaplan sınıfı takipet çalıştı.")
    }

    override fun avlan() {

    }


}

fun main() {

    var h: Hayvan = Kaplan() // burda sıkıntı yok

}

