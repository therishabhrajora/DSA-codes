public class SubArray {
    // Method to find and print all subarrays
    public static void findSubArray(int[] numbers){
        int end = numbers.length;
        for(int i = 0; i < end; i++){
            for(int j = i; j < end; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findSubArray(numbers);
    }
}
