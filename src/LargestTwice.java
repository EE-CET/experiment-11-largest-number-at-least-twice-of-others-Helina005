
       import java.util.*;

public class LargestTwice {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 1: Find largest and second largest
        int max = -1, secondMax = -1, index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        // Step 2: Check condition
        if (max >= 2 * secondMax) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}