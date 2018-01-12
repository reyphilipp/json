import us.monoid.web.Resty
import com.google.gson.*


fun main(args: Array<String>) {
    val r = Resty()
    val gson = Gson()
    val meineBtc = 0.0423
    val jsonArray = r.json("https://api.coinmarketcap.com/v1/ticker/bitcoin/?convert=EUR").array()
    val datenJson = gson.fromJson(jsonArray[0].toString(), Data::class.java)
    print(datenJson.price_eur.toDouble() * meineBtc)
    println(" Euro")
}




