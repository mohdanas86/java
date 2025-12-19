
public class Main {

    public static void printArray(int[] arr, int n) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(int[] arr, int n) {
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
            }
        }
        System.out.println(i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int n = arr.length;

        printArray(arr, n);
        removeDuplicate(arr, n);
        printArray(arr, n);
    }
}
