package Sorular

import java.text.DateFormatSymbols
import java.util.*


/*
*  fun main() {

    println(getMonthForInt(Calendar.MONTH))

}

fun getMonthForInt(num :Int) : String{
    var month = "wrong"
    var dfs = DateFormatSymbols()
    var months = dfs.months
    if (num >=0 && num<=11){
        month = months[num]
    }
    return month
}
*
* */

fun main() {
// Emre'nin çözümü
    var aylar = arrayOf("Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık")
    var suankiAy = Calendar.getInstance().get(Calendar.MONTH)
    println(aylar[suankiAy])

}

