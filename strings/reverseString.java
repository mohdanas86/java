
public class reverseString {

    public static String reverseString(String name, int n) {
        int st = 0;
        int end = n - 1;
        char[] arr = name.toCharArray();

        while (st < end) {
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String name = "anas";
        int n = name.length();

        System.out.println(name);
        String rev = reverseString(name, n);
        System.out.println(rev);
    }
}
