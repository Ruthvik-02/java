public class ByandSell {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxprofit = 0;

        if(len==1){
            return maxprofit;
        }

        int left =0;

        for(int right=1;right<len;right++){
            if(prices[right]>prices[left]){
                int currentprofit = prices[right]-prices[left];
                maxprofit = Math.max(maxprofit,currentprofit);
            }
            else{
                left=right;
            }
        }
        return maxprofit;
    }

    m
}
