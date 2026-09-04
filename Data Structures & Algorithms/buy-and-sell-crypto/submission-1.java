class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            for(int j=i;j>=0;j--){
                if((prices[i]-prices[j]) > profit){
                    profit=prices[i]-prices[j];
                }
            }
        }
        return profit>0?profit:0;
    }
}
