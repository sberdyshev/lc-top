package problems.easy._0001_remove_duplicates_from_sorted_array;

public class SolutionToRemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("First iteration:");

        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println("\nSecond iteration:");

        int [] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
