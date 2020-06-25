package Sorular

fun main() {

    var ucgen = arrayOfNulls<Int>(3)

    for (i in 0..ucgen.size-1){
        println("${i+1}. kenarı girin : ")
        ucgen[i] = readLine()?.toInt()
    }

     if (ucgen[0]==ucgen[1] && ucgen[0] == ucgen[2]){
         println("eşkenar üçgendir.")
     }
     else if(ucgen[0]!=ucgen[1]&&ucgen[0]!=ucgen[2]&&ucgen[1]!=ucgen[2]){
         println("çeşitkenar üçgendir.")
     }
    else{
         println("ikizkenar üçgendir")
     }



}