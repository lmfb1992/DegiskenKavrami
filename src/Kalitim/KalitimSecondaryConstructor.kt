package Kalitim

open class Person2{

    var isim:String
    var yas: Int
    var isMan:Boolean = false

    constructor(isim:String,yas:Int){

        this.isim = isim
        this.yas = yas
    }

    constructor(isim:String,yas:Int,isMan:Boolean) : this(isim, yas){

        this.isMan = isMan
    }

    override fun toString(): String {

        var cinsiyet = if(isMan) "erkek" else "kadın"
        return "isim : $isim yas : $yas cinsiyet : $cinsiyet"
    }
}

class Ogretmen2 :Person3{

    var brans:String
    constructor(isim:String,yas:Int,isMan:Boolean,brans:String) : super(isim, yas, isMan){
        this.brans = brans

    }

    override fun toString(): String {
        return super.toString()+ " brans : $brans"
    }

}

fun main() {


    var p1 = Person3("Emre",29,true)
    println(p1.toString())

    var p2 = Person3("fatma",35)
    println(p2.toString())

    var ogr1 = Ogretmen3("Mahmut",65,true,"tarih")
    println(ogr1)
}

