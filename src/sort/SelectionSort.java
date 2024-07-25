package sort;

import java.util.Arrays;
import java.util.Random;


/**
 * 각 위치에 알맞은 값을 선택하여 집어 넣는 방식의 정렬
 * 시간 복잡도: O(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(10);
        }

        selectionSortASC(nums);
        System.out.println(Arrays.toString(nums));

        selectionsSortDSC(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSortASC(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i; // 최소값을 가리키는 인덱스

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }
    }

    private static void selectionsSortDSC(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[maxIdx]) {
                    maxIdx = j;
                }
            }

            int tmp = nums[i];
            nums[i] = nums[maxIdx];
            nums[maxIdx] = tmp;
        }
    }
}
