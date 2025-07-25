public class LastOccurrance {
    public static int findLastOccurrance(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = findLastOccurrance(arr, key, i + 1);
        if(isfound != -1){
            return isfound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 6, 10};
        int key = 6;
        int index = findLastOccurrance(arr, key, 0);
        if(index != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }
    }
}
