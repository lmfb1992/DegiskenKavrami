package CepTelefonuUygulamasi

class Kisi(var isim:String,var telNo:String) {


    companion object{
        fun kisiOlustur(isim:String, telNo:String) : Kisi{

            /*var geciciKisi = Kisi(isim,telNo)
            return geciciKisi*/

            return Kisi(isim,telNo)
        }
    }



}