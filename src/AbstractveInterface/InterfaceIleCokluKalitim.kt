package AbstractveInterface
/*
abstract class Sporcu{

    abstract fun sporYap()
}


open class BuzPateni : Sporcu(){


    override fun sporYap() {

        println("Buz pateni yapıyor")

    }

}

open class Basketbol: Sporcu(){
    override fun sporYap() {
        println("Basketbol oynuyor")
    }

}

class Sportmenler: BuzPateni(),Basketbol(){


}*/

interface BuzUstundeKayabilme{
   fun buzustundeKay()



}


interface BasketAtabilme{
    fun basketAt()

}

class Sportmenler : BuzUstundeKayabilme,BasketAtabilme{
    override fun buzustundeKay() {
        
    }

    override fun basketAt() {

    }

}