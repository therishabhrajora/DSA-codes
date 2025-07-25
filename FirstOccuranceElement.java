public class FirstOccuranceElement {
    public static int findFirstOcurrance(int[] arr,int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        return findFirstOcurrance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int index = findFirstOcurrance(arr, key, 0);
        if(index != -1) {
            System.out.println("First occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }
    }
}
