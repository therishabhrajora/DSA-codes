public class Searching {
    // linear search O(n)
    public static void linearsearch(int[] numbers,int key){
        boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }

    public static void binarySearch(int[] numbers,int key){
        int start=0, end=numbers.length-1;
        boolean found = false;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }else if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }




    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key=5;
        linearsearch(numbers, key);
        binarySearch(numbers, key);

    }
}
