public class maxSubArraySum {
    
    public static void maxSubAraySum(int[] numbers) {
        int maxSum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+numbers[k];
                    if(maxSum<currsum){
                        maxSum=currsum;
                    }
                }
                
            }
            System.out.println("Maximum subarray sum so far: " + maxSum);
        }
        
    }
    public static void main(String[] args) {
        int[] numbers = {1, -2, 9, -7, 5, 6, -7, 8, -9, -10};
        maxSubAraySum(numbers);
    }
    
}
