/*
=========================================================
Problem #121: Best Time to Buy and Sell Stock
Difficulty: Easy

Category:
- Arrays

Pattern:
- Greedy
- One Pass

Approach:
- Assume the first day's price is the minimum buying price.
- Traverse the array once.
- Update the minimum buying price whenever a lower price is found.
- Calculate the profit by selling on the current day.
- Keep track of the maximum profit obtained.
- Return the maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Maintain the minimum value seen so far.
- At every step, calculate the profit if the stock is sold today.
- Greedy works because the best buying price before the current
  day is all that matters.

Optimization:
- Already Optimal.

Common Mistake:
- Buying after selling.
- Updating the maximum profit before updating the minimum price.

=========================================================
*/
package array;

class Solution {

    public int maxProfit(int[] prices) {

        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int price : prices) {

            minimumPrice = Math.min(minimumPrice, price);

            maximumProfit = Math.max(maximumProfit,
                                     price - minimumPrice);
        }

        return maximumProfit;
    }
}