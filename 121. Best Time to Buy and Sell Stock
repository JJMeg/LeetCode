class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int max = 0;
        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if (i == j)
                    max = find_max(max,0);
                else
                    max = find_max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }
    
    public int find_max(int a,int b){
        return a>b?a:b;
    }
}
