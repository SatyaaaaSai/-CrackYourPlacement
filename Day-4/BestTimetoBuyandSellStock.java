
// Given an array prices where prices[i] is the price of a given stock on the i-th day, find the maximum profit you can achieve. You may complete at most two transactions.



public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // int index=0;
        // int profit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<min){
        //         min=prices[i];
        //         index=i;
        //     }
        // }
        // for(int j=index;j<prices.length;j++){
        //     if(prices[j]>max){
        //         max=prices[j];
        //     }
        //  }
        //     return max-min;
            if(prices.length==1){
                return 0;
            }
            int min=prices[0];
            int maxProfit=Integer.MIN_VALUE;
            for(int i=1;i<prices.length;i++){
                if(prices[i]<min){
                    min=prices[i];
                } 
                int value=prices[i]-min;
                maxProfit=Math.max(maxProfit,value);
            }
            return maxProfit;
        }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock obj=new BestTimetoBuyandSellStock(); //
        int[] prices={7,1,5,3,6,4};
        int maxProfit=obj.maxProfit(prices);
        System.out.println("Maximum Profit: "+maxProfit);
    }
    
}
