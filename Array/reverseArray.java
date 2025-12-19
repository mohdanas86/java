
class reverseArray {

    public static void printArray(int[] nums, int n) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] nums, int n) {
        int st = 0, end = n - 1;

        while (st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        printArray(arr, n);
        reverse(arr, n);
        printArray(arr, n);
    }
}
