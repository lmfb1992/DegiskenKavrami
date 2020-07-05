package AbstractveInterface

object JavaStaticKavrami {

    var sinifAdi = "JavaStaticKavrami"

    @JvmStatic
    fun main(args: Array<String>) {
        val ogr1 = OgrenciJava(1, "Emre")
        ogr1.bilgileriYazdir()
        val ogr2 = OgrenciJava(2, "Hasan")
        ogr2.bilgileriYazdir()
        val ogr3 = OgrenciJava(3, "Ali")
        ogr3.bilgileriYazdir()
    }
}

internal class OgrenciJava(private val id: Int, private val isim: String) {
    fun bilgileriYazdir() {
        println("No : $id İsim : $isim Toplam Öğrenci  Sayısı : $toplmaOgrenciSayisi")
    }

    companion object {
        private var toplmaOgrenciSayisi = 0
    }

    init {
        toplmaOgrenciSayisi++
    }
}