package AbstractveInterface

interface Okuyabilen{
    fun oku()
}

class Tarayici : Okuyabilen{
    override fun oku() {
        println("Tarayici sinifindan oku methodu tetiklendi.")
    }


}

fun main() {

    var tarayici = Tarayici()
    tarayici.oku()

    var isimsizSinif = object : Okuyabilen{

        override fun oku() {
            println("isimsiz sınıfındaki oku methodu tetiklendi")
        }

    }

    isimsizSinif.oku()
}