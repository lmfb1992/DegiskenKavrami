package AbstractveInterface


object Ogr{


    var sayac : Int =0

    fun sayaciGoster(){

        println("Sayac : "+ sayac)

    }


}


fun main() {

    var ogr1 : Ogr = Ogr
    ogr1.sayac=8
    Ogr.sayaciGoster()


    var ogr2:Ogr = Ogr
    ogr2.sayac =18
    Ogr.sayaciGoster()
    ogr1.sayaciGoster()



}