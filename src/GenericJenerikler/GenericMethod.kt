package GenericJenerikler


abstract class GeometrikSekil{

   abstract fun alanHesapla():Int

}

class Kare(var kenarUzunlugu:Int):GeometrikSekil(){
    override fun alanHesapla(): Int {
        return kenarUzunlugu*kenarUzunlugu
    }

}

class Dikdortgen(var en:Int,var boy:Int) : GeometrikSekil(){
    override fun alanHesapla(): Int {
        return en*boy
    }

}

fun main() {


    var kare1 = Kare(6)
    var kare2 = Kare(8)

    var buyukKare = alanKarsilastir(kare1,kare2)
    println("Büyük karenin alanı : ${buyukKare.alanHesapla()}")

    var dikdortgen1 = Dikdortgen(6,8)
    var dikdortgen2 = Dikdortgen(8,9)

    var buyukDikdortgen = alanKarsilastir(dikdortgen1,dikdortgen2)
    println("Büyük dikdörtgenin alanı : ${buyukDikdortgen.alanHesapla()}")

    var gs1:GeometrikSekil = Kare(8)
    var gs2:GeometrikSekil = Kare(14)

    var buyukGS = alanKarsilastir(gs1,gs2)
    println("büyük olan şekil : ${buyukGS.alanHesapla()}")



    var sekil1 = Dikdortgen(3,5)
    var sekil2 = Dikdortgen(7,9)
    println("Büyük alan : "+ genericAlanKarsilastirFun(sekil1,sekil2).alanHesapla())

}


fun <Genel:GeometrikSekil> genericAlanKarsilastirFun(sekil1:Genel,sekil2:Genel) : Genel{
    if (sekil1.alanHesapla()<sekil2.alanHesapla())
        return sekil2
    else
        return sekil1


}
fun alanKarsilastir(gs1:GeometrikSekil, gs2:GeometrikSekil):GeometrikSekil{
    if (gs1.alanHesapla()<gs2.alanHesapla())
        return gs2
    else
        return gs1
}

fun alanKarsilastir(k1:Kare,k2:Kare):Kare{

    if (k1.alanHesapla()<k2.alanHesapla())
        return k2
    else
        return k1

}

fun alanKarsilastir(d1:Dikdortgen,d2:Dikdortgen):Dikdortgen{

    if (d1.alanHesapla()<d2.alanHesapla())
        return d2
    else
        return d1

}
