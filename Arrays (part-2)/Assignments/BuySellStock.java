package Assignments;

public class BuySellStock {

    public static int sellStock(int price[]){
        int maxProfit = 0;
        int buyPrice = price[0];
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);

            }else{
                buyPrice = Math.min(buyPrice,price[i]);
            }         
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] ={7,1,5,3,6,4};
        System.out.println(sellStock(price));
    }

    
}