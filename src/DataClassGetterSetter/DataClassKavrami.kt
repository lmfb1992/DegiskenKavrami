package DataClassGetterSetter

class Kisi(val id:Int , val isim:String){

    /*override fun toString(): String {
        return "id : $id isim : $isim"
    }*/



}

data class KisiData(val id:Int , val isim:String)

fun main() {

    val emre = Kisi(1,"Emre")
    val hasan = Kisi(2,"Hasan")
    val emreKopya = emre
    val test = Kisi(1,"Emre")

    println(emre.toString())
    println(emre.hashCode())
    println(emre.equals(hasan))
    println(emre.equals(emreKopya))
    println(emre.equals(test))
    println("***********************************")

    val emred = KisiData(1,"Emre")
    val hasand = KisiData(2,"Hasan")
    val emreKopyad = emred
    val testd = KisiData(1,"Emre")

    println(emred.toString())
    println(emred.hashCode())
    println(emred.equals(hasand))
    println(emred.equals(emreKopyad))
    println(emred.equals(testd))

    val kopyaHasan = hasand.copy()
    println("Kopya hasan : "+kopyaHasan)
    println("Kopya hasan id değişik "+hasand.copy(id=90))

    var(id,isim) = emred

    println("$id $isim")

}

