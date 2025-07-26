package TOP150;

public class LC121 {

    public static int maxProfile(int[] prices) {

       int profit = 0;
       int buying_price = prices[0];

        for(int i=1 ; i<prices.length; i++){

            if(prices[i]<=buying_price){
                buying_price = prices[i];
                continue;
            }
        profit = Math.max(profit,prices[i]-buying_price);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,5,2,1,26,25};
        int prof = maxProfile(prices);
        System.out.println(prof);
    }
}
