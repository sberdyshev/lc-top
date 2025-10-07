package problems.easy._01_array._0005_find_unique_element;

public class FindUniqueElement {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        int [] nums2 = {4,1,2,1,2};
        int [] nums3 = {1};

        System.out.println(findUniqueElement(nums));
        System.out.println(findUniqueElement(nums2));
        System.out.println(findUniqueElement(nums3));
    }

    public static int findUniqueElement(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
