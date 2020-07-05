package DosyaIslemleri

import java.io.FileWriter


fun main() {

    //dosya oluşturma
    var dosya = FileWriter("ilkdosya.txt")

    println("Adınız giriniz : ")
    var isim = readLine()!!
    dosya.write(isim+"\n")
    dosya.write("Yaş 29")
    println("veri dosyaya yazıldı")
    dosya.close()


}
