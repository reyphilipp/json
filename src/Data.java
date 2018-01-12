import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    public String id;
    public String name;
    public String symbol;
    public String rank;
    public String price_usd;
    public String price_btc;
    @JsonProperty("24h_volume_usd")
    public String _24h_volume_usd;
    public String market_cap_usd;
    public String available_supply;
    public String total_supply;
    public String max_supply;
    public String percent_change_1h;
    public String percent_change_24h;
    public String percent_change_7d;
    public String last_updated;
    public String price_eur;
    @JsonProperty("24h_volume_eur")
    public String _24h_volume_eur;
    public  String market_cap_eur;
}