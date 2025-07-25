public class PairsofElements {
    public static void findPairs(int[] numbers) {
        for(int i=0;i<numbers.length;i++){
            for(int j = i + 1; j < numbers.length; j++) {
                System.out.print(String.format("(%d,%d)", numbers[i], numbers[j]));
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int key = 10;
        findPairs(numbers);
    }
}
