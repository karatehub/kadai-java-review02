
public class Review01 {

    public static void main(String[] args) {
        int price = 500;
        double tax_rate = 10;
        int Consumption_Tax = tax(price, tax_rate);
        int Price_Including_Tax = Consumption_Tax + price;
        System.out.println(price + "円の商品の税込価格は" + Price_Including_Tax + "円（消費税は" + Consumption_Tax + "円）です。");
    }
    
    public static int tax(int price, double tax_rate) {
        double keisan = (100 + tax_rate) / 100;
        double Consumption_Tax = (price * keisan) - price;
        return (int)Consumption_Tax;
    }

}
