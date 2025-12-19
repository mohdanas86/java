
import java.util.*;

public class findMissingNumber {

    // brute force approach
    public static int bruteForce(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return i;
            }
        }

        return -1;
    }

    // optimal solution
    public static int findNumber(int[] arr, int n) {
        HashSet<Integer> hash = new HashSet<>();

        for (int val : arr) {
            hash.add(val);
        }

        for (int i = 1; i < n; i++) {
            if (!hash.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = arr.length;

        System.out.println(findNumber(arr, n));
    }
}
