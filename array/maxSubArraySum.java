public class maxSubArraySum {

    public static void maxSubAraySum(int[] numbers) {
        int maxSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum = currsum + numbers[k];
                    if (maxSum < currsum) {
                        maxSum = currsum;
                    }
                }

            }
            System.out.println("Maximum subarray sum so far: " + maxSum);
        }

    }

    public static int maxsumarray(int[] numbers) {
        int max = Integer.MIN_VALUE;// -ve infinite
        int curr = 0;
        for (int i : numbers) {
            curr = curr + i;
            if (curr > max) {
                max = curr;
            }

            if (curr < 0) {
                curr = 0;
            }

        }
 
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 9, -7, 5, 6, -7, 8, -9, -10 };
        // maxSubAraySum(numbers);
        System.out.println(maxsumarray(numbers));

    }

}
