package diziRangeInKavramlari

fun main() {

    // 1 ile 20 arasındaki sayılar

    var sayilar = 1..20
    var adanZye = 'a'..'z'

    var sayilarTersten = 20..1
    var harflerTersten = 'z'..'a'

    var oneToTwenty = 1.rangeTo(20)
    var oneToTwentyReverse = 20.downTo(1)

    var beserBeserSayilar = 0.rangeTo(100).step(5)
    var beserBeserSayilarReverse = 100.rangeTo(1).step(5)

    var elemanVarMi = 11 in beserBeserSayilar

    println("11 range içinde mi : "+elemanVarMi)

    println(beserBeserSayilar.first)
    println(beserBeserSayilar.last)
    println(beserBeserSayilar.step)

}