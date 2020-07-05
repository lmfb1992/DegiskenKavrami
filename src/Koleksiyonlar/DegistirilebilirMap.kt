package Koleksiyonlar

//hashmapof ile mutablemapof

fun main() {

    var degistirilebilirMap = hashMapOf<String,String>("1" to "emre","2" to "hasan")
    degistirilebilirMap.put("3","ali")
//okuma
    println(degistirilebilirMap.get("2"))
    println(degistirilebilirMap["3"])
//ekleme
    degistirilebilirMap.put("4","melek")
    //güncelleme
    degistirilebilirMap.set("1","yeni emre")
    for (oankiEleman in degistirilebilirMap){
        println(oankiEleman.value)
        println(oankiEleman.key)
    }

    //eleman silerken
    degistirilebilirMap.remove("3")

    for (oankiEleman in degistirilebilirMap){
        println(oankiEleman.value)

    }


}