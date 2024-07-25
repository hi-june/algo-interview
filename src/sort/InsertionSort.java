package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 카드를 뽑듯이 정렬하는 방법
 * 시간 복잡도: O(n^2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
        }

        insertionSortASC(nums);
        System.out.println(Arrays.toString(nums));

        insertionSortDSC(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSortASC(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int picked = nums[i];
            int prevIdx = i - 1;

            while (prevIdx >= 0 && picked < nums[prevIdx]) {
                nums[prevIdx + 1] = nums[prevIdx];
                prevIdx--;
            }

            nums[prevIdx + 1] = picked;
        }
    }

    private static void insertionSortDSC(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int picked = nums[i];
            int prev = i - 1;

            while (prev >= 0 && picked > nums[prev]) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            nums[prev + 1] = picked;
        }
    }
}
