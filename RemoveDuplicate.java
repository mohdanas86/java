
import java.util.*;

public class RemoveDuplicate {

    // hashing technique
    public static void removeDuplicateValueHashing(Vector<Integer> nums, int n) {
        HashSet<Integer> hash = new HashSet<>();

        int index = 0;

        for (int num : nums) {
            if (!hash.contains(num)) {
                hash.add(num);
                index++;
            }
        }
        System.out.println("Total unique values : " + index);
        System.out.println("Unique Elements : " + hash);
    }

    // optimal solution - using two pointers
    public static void removeDuplicateValue(int[] nums, int n) {
        int index = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println("Total unique values : " + index);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5};
        int n = nums.length;

        removeDuplicateValue(nums, n);
    }
}
