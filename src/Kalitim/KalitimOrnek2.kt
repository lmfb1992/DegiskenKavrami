package Kalitim

open class Person3(open var isim:String, open var yas:Int,open var isMan:Boolean=false){

    override fun toString(): String {
        var cinsiyet = if (isMan) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet $cinsiyet"
    }
    open fun bilgileriGoster() : String {
        var cinsiyet = if (isMan) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet $cinsiyet"
    }
}
class Ogretmen3(override var isim:String, override var yas:Int,override var isMan: Boolean,var brans :String):Person3(isim, yas, isMan){

    override fun toString(): String {
        return super.toString() + " brans $brans"
    }
    override fun bilgileriGoster(): String {
        return super.bilgileriGoster() + " brans : $brans"
    }
}
fun main(args: Array<String>) {
    var p1:Person3=Person3("emre", 29, true)
    println(p1.toString())
    var p2:Person3=Person3("fatma", 35)
    println(p2.toString())
    var ogr1:Ogretmen3= Ogretmen3("mahmut", 65, true,"Tarih")
    println(ogr1)
    println(ogr1.bilgileriGoster())}