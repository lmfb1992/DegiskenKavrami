package DosyaIslemleri


import java.io.FileReader
import java.lang.Exception


fun main() {

    var dosya :FileReader?=null

    try {
       dosya = FileReader("ilkdosya.txt")

       var okunanVeri : Int = 0
        /*do{

            okunanVeri=dosya.read()
            print(okunanVeri.toChar())
        }while (okunanVeri !=-1)*/
        while (okunanVeri != -1){

            print(okunanVeri.toChar())
            okunanVeri=dosya.read()


        }

    }catch (istisna: Exception){
        println(istisna.toString())
    }
    finally {
        dosya?.close()
    }


    var dosya2 = FileReader("ilkdosya.txt")
    println("\nforeachline ile okuma")

    dosya2.forEachLine {
        println(it)
    }


}
