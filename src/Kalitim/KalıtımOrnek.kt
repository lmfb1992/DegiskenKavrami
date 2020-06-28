package Kalitim

open class Person(open var isim:String,open var yas:Int,  open var isMan:Boolean){
    init {
        println("person sınıfının initi tetiklendi.")

    }
    override fun toString(): String {

        var cinsiyet = if(isMan) "erkek" else "kadın"
        return "isim : $isim yas : $yas cinsiyet : $cinsiyet"
    }


}
class Ogretmen(override var isim:String,override var yas:Int, override var isMan:Boolean,var brans:String) : Person(isim,yas,isMan){

    init {
        println("Ogretmen sınıfının initi tetiklendi.")
        if (yas<0){
            yas = 50
        }

    }
    
    override fun toString(): String {
        return super.toString()+ " brans : $brans"
    }
}

fun main() {
    var p1 = Person("emre",29,true)
    println(p1)

    var ogr1 = Ogretmen("fatma",-9,false,"Matematik")
    println(ogr1)

}

/*
* package Kalitim

open class Person(isim:String, yas:Int, isMan:Boolean){

    var isim:String
    open var yas:Int = 0
    var isMan:Boolean

    init {
        println("person sınıfının initi tetiklendi.")
        this.isim = isim
        this.yas= yas
        this.isMan = isMan
    }


    override fun toString(): String {

        var cinsiyet = if(isMan) "erkek" else "kadın"
        return "isim : $isim yas : $yas cinsiyet : $cinsiyet"
    }


}
class Ogretmen(isim:String,override var yas:Int, isMan:Boolean,brans:String) : Person(isim,yas,isMan){


    var brans:String
    init {
        println("Ogretmen sınıfının initi tetiklendi.")
        if (yas<0){
            yas = 50
        }
        this.brans = brans
    }

    override fun toString(): String {
        return super.toString()+ " brans : $brans"
    }
}

fun main() {
    var p1 = Person("emre",29,true)
    println(p1)

    var ogr1 = Ogretmen("fatma",-9,false,"Matematik")
    println(ogr1)

}
*
* */