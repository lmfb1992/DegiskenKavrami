package DegiskenKavramiVeCesitleri

fun main() {

 //println("Merhaba Dünya")// Unit java da ki void e karşılık gelir.


/* var sayi: Int
 sayi=5

 println(sayi)*/


 //Number Veri Türleri
  //byte,short,int,long,float,double
 var byteMin: Byte = Byte.MIN_VALUE
 println("Byte en küçük değeri : "+byteMin) //8 bit = 1 byte

 var byteMax : Byte = Byte.MAX_VALUE
 println("Byte en büyük değeri : "+byteMax)

 var shortMin : Short = Short.MIN_VALUE
 println("Short en küçük değeri : "+shortMin)//16 bit  = 2 byte

 var shortMax : Short = Short.MAX_VALUE
 println("Short en büyük değeri : "+shortMax)

 var intMin : Int = Int.MIN_VALUE
 println("Int en küçük değeri : "+intMin)//32 bit = 4 byte

 var intMax : Int = Int.MAX_VALUE
 println("Int en büyük değeri : "+intMax)

 var longMin : Long = Long.MIN_VALUE
 println("Long en küçük değeri : $longMin")//64 bit = 8 byte

 var longMax : Long = Long.MAX_VALUE
 println("Long en büyük değeri : $longMax")


 var floatMin : Float = Float.MIN_VALUE // 32 bit = 4 byte
 println("Float en küçük değeri : ${floatMin}")


 var floatMax : Float = Float.MAX_VALUE
 print("Float en büyük değeri : ${floatMax} \n")

 var doubleMin = Double.MIN_VALUE
 println("Double en küçük değeri : "+doubleMin) // 64 bit = 8 byte

 var doubleMax = Double.MAX_VALUE
 println("Double en büyük değeri : "+doubleMax)






}