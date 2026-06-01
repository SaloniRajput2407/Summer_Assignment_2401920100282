class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
      int maxProfit = 0;
       for(int ele : prices){
        if(ele < minPrice){
            minPrice = ele;
        }
        else{
            int profit = ele-minPrice;
            maxProfit = Math.max(profit,maxProfit);
        }
       } 
       return maxProfit;
    }
   
}
