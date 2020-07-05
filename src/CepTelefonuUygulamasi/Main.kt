package CepTelefonuUygulamasi

import java.util.*

private val tara = Scanner(System.`in`)
private val cepTelefonu = CepTelefonu("555-55-55")

fun main() {

    telefonuBaslat()
    menuGoster()

    var cikis :Boolean = false

    while (!cikis){

        println("SEÇİMİNİZ : (Menüyü görmek için 6 ya basın)")
        var secim = tara.nextInt()

        when(secim){
            0 -> {
                println("Çıkış yapılıyor...")
                cikis=true;

            }
            1 ->{
                cepTelefonu.tumKisileriListele()
            }
            2 -> {

                yeniKisiEkleFonksiyonu()


            }
            3->{
                kisiSorgulaMethodu()

            }
            4->{
                kisiSilMethodu()
            }
            5-> {
                kisiGuncelleMethodu()
            }
            6 -> {
                menuGoster()
            }
            else -> {
                println("yanlış bir seçim yaptınız tekrar deneyiniz...")
            }
        }

    }
}

fun kisiGuncelleMethodu() {
    println("Güncellenecek kişinin adı : ")
    val isim = tara.next()

    val bulunanKisi = cepTelefonu.kisiSorgula(isim)
    if (bulunanKisi==null){
        println("kayıt bulunamadı")
        return
    }

    println("yeni adı giriniz:")
    val yeniIsim = tara.next()
    println("yeni kişinin numarasını giriniz: ")
    val yeniNumara = tara.next()

    cepTelefonu.kisiGuncelle(bulunanKisi, Kisi.kisiOlustur(yeniIsim,yeniNumara))
}

fun kisiSilMethodu() {
    println("Silinecek kişinin adını girin : ")
    val isim = tara.next()
    val bulunanKisi = cepTelefonu.kisiSorgula(isim)

    if (bulunanKisi!=null){
        if (cepTelefonu.kisiSil(bulunanKisi!!)){
            println("silme yapıldı")
        }

    }else{
        println("kişi bulunamadı")
    }

}

fun yeniKisiEkleFonksiyonu() {
    println("Yeni kişinin adını giriniz:")
    val isim = tara.next()

    println("yeni kişinin numarasını giriniz : ")
    val numara = tara.next()

    cepTelefonu.ekleYeniKisi(Kisi.kisiOlustur(isim,numara))
}

fun kisiSorgulaMethodu(){

    println("Aranacak kişi adını giriniz : ")
    val isim = tara.next()
    val bulunanKisi = cepTelefonu.kisiSorgula(isim)

    if (bulunanKisi == null){
        println("Rehberde böyle bir kişi yok")
    }
    else{
        println("Bulunan Kişi : ${bulunanKisi.isim} ---- ${bulunanKisi.telNo}")
    }
}

fun menuGoster() {

    println(" ****************************** MENU ******************************\n")
    println("0 -- Çıkış \n"+"1 -- Tüm Kişileri Listele \n"+"2 -- Yeni Kişi Ekle \n"+"3 -- Kişi Sorgula \n"+"4 -- Kişi Sil \n"
    +"5 -- Kişi Güncelle \n"+"6 -- Menüyü Göster\n")
}

fun telefonuBaslat() {

    println("Telefon başlatılıyor....\n\n")
}
