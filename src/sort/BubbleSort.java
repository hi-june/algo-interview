package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 방법
 * 시간 복잡도: O(n^2)
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
        }

        bubbleSortASC(nums);
        System.out.println(Arrays.toString(nums));

        bubbleSortDSC(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSortASC(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];

                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    private static void bubbleSortDSC(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    int tmp = nums[i];

                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}
