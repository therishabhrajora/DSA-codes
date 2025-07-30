public class ReverseArray {
    // Method to reverse an array
    public static void revereArray(int[] numbers){
        int start=0,end=numbers.length-1;
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] numbers){   
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array:");
        printArray(numbers);
        revereArray(numbers);
        System.out.println("Reversed Array:");
        printArray(numbers);
    }
}
