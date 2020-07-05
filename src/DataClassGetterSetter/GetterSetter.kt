package DataClassGetterSetter

class KitapKotlin{

    var id: Int
    get() = field
    set(value) {
        if (value<0){
            field=1
        }else{
            field= value
        }
    }
    var isim : String
    var kapakRenk:KapakRenk
    constructor(id: Int, isim :String,kapakRenk: KapakRenk){
        this.id=id
        this.isim = isim
        this.kapakRenk = kapakRenk
    }
}

enum class KapakRenk{
    KIRMIZI,
    MAVİ,
    YEŞİL



}

fun main() {


    var k1: Kitap  = Kitap(-9,"Sefiller")

    println(k1.ad)

    k1.ıd=-9
    println(k1.ıd)

    var k2:KitapKotlin = KitapKotlin(-7,"vadideki zambak",KapakRenk.KIRMIZI)
    println(k2.id)
    k2.id=-9555
    println(k2.kapakRenk)
    println(k2.id)
}

