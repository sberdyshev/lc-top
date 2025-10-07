package problems.easy._01_array._0004_array_contains_duplicates;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int [] nums2 = {1,2,3,4};
        int [] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicateCheck(nums));
        System.out.println(duplicateCheck(nums2));
        System.out.println(duplicateCheck(nums3));
    }

    public static boolean duplicateCheck(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
