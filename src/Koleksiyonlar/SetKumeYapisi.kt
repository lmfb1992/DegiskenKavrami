package Koleksiyonlar

//setof, mutablesetof


fun main() {


    var degistirilemeyenSet = setOf("emre","hasan",5,9,"emre")


    for (oankiDeger in degistirilemeyenSet){
        println(oankiDeger)
    }



    var degistirilebilenSet = mutableSetOf<Int>()

    degistirilebilenSet.add(9)
    degistirilebilenSet.add(6)
    degistirilebilenSet.add(1)
    degistirilebilenSet.add(6)
    degistirilebilenSet.add(9)


    println("Size"+degistirilebilenSet.size)

    println(degistirilebilenSet)

    for (oankiSayi in degistirilebilenSet){
        println(oankiSayi)
    }


}