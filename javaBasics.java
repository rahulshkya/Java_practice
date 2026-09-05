
public class javaBasics {

    public static void PrintSubarray(int numbers[]) {

        int maxSum = 0;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // Create prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                int currentSum = start == 0
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max sum is: " + maxSum);
    }

    public static void Kadaness(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max sum is: " + ms);

    }

    public static int TrappingRainWater(int height[]) {

        int n = height.length;
        int trappedwater = 0;
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];

        }
        return trappedwater;
    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {

                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = {4, 2, 0, 6, 3, 2, 5};
        buyAndSellStocks(prices);
        System.out.println("Max profit is: " + buyAndSellStocks(prices));

    }
}
