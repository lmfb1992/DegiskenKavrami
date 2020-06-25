package Sorular

fun main() {

    println("vize girin : ")
    var vize = readLine()!!.toDouble()*0.4
    println("final girin : ")
    var final = readLine()!!.toDouble()*0.6

    if ((final+vize)>=50){
        println("geçtiniz not: ${final+vize}")
    }
    else{
        println("geçemediniz not: ${final+vize}")
    }


}