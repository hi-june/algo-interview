package sort;

import java.util.Arrays;
import java.util.Random;


public class QuickSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
        }

        System.out.println(Arrays.toString(nums));

        quickSortASC(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        quickSortDSC(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSortASC(int[] nums, int lo, int hi) {
        if (lo >= hi) return;

        int pivot = partitionASC(nums, lo, hi);

        quickSortASC(nums, lo, pivot - 1);
        quickSortASC(nums, pivot + 1, hi);
    }

    private static int partitionASC(int[] nums, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = nums[left];

        while (lo < hi) {
            // pivot 값 보다 작거나 같은 숫자 찾기
            while (nums[hi] > pivot && lo < hi) {
                hi--;
            }

            // pivot 값 보다 큰 숫자 찾기
            while (nums[lo] <= pivot && lo < hi) {
                lo++;
            }

            swap(nums, lo, hi);
        }

        swap(nums, left, lo);

        return lo;
    }

    private static void quickSortDSC(int[] nums, int lo, int hi) {
        if (lo >= hi) return;

        int pivot = partitionDSC(nums, lo, hi);

        quickSortDSC(nums, lo, pivot - 1);
        quickSortDSC(nums, pivot + 1, hi);
    }

    private static int partitionDSC(int[] nums, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = nums[left];

        while (lo < hi) {
            // pivot 보다 큰 값 찾기
            while (nums[hi] < pivot && lo < hi) {
                hi--;
            }

            // pivot 보다 작은 값 찾기
            while (nums[lo] >= pivot && lo < hi) {
                lo++;
            }

            swap(nums, lo, hi);
        }

        swap(nums, left, lo);

        return lo;
    }


    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
