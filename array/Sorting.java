public class Sorting {
    // Method to sort an array using bubble sort
    // Time Complexity: O(n^2)
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    // Time Complexity: O(n^2)
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minPos];
                numbers[minPos] = temp;
            }
        }
    }

    // Time Complexity: O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i], prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Time Complexity: O(n + k)
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Time Complexity: O(n log n)
    public static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e, mid);
    }

    // Time Complexity: O(n)
    public static void merge(int[] arr, int s, int e, int mid) {
        int temp[] = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l];
        }
    }

    // Time Complexity: O(n log n)
    public static void quickSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pidx = partition(arr, s, e);
        quickSort(arr, s, pidx - 1);
        quickSort(arr, pidx + 1, e);
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 5, 6 };
        countingSort(numbers);
        System.out.println("Sorted Array using Counting Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted Array using Merge Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        int[] numbers2 = { 3, 6, 8, 10, 1, 2, 1 };
        System.out.println("Original Array:");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();
        quickSort(numbers2, 0, numbers2.length - 1);
        System.out.println("Sorted Array using Quick Sort:");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
    }
}
