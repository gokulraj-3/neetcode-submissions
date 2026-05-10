class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.size(); i++){
            if(buy < prices[i]){
                profit = max((prices[i] - buy), profit);
            }
            if(buy > prices[i] || buy == prices[i]){
                buy = prices[i];
            }

        }
        return profit;
    }
};

//starting buy_position = price[0]
//profit = 0 
// profit = max(buy - current_price/prices[i], profit)
