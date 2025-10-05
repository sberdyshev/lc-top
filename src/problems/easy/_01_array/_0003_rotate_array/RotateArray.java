package problems.easy._01_array._0003_rotate_array;

import java.lang.annotation.ElementType;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {-1, -100, 3, 99};

        rotate2(arr1, 3);
        rotate2(arr2, 2);

        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] nums, int k) {

        //corner cases
        if (nums == null || nums.length <= 1 || (k % nums.length) == 0) {
            return;
        }

        //calculate amount of cycles to run
        int amountOfCycles = 0;
        int a = nums.length;
        int b = k;
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        amountOfCycles = Math.abs(a);

        for (int i = 0; i < amountOfCycles; i++) {

            //taking initial element and its value
            int currentElement = i;
            int savedValue = nums[currentElement];
            int nextElement = (currentElement + k % nums.length) % nums.length;

            do {
                //next element pointer
                int nextValue = nums[nextElement];
                nums[nextElement] = savedValue;

                currentElement = nextElement;
                savedValue = nextValue;
                nextElement = (currentElement + k % nums.length) % nums.length;

            } while (nextElement != (i + k % nums.length) % nums.length);
        }
    }

    public static void rotate2(int[] nums, int k) {
        //corner cases
        if (nums == null || nums.length <= 1 || (k % nums.length) == 0) {
            return;
        }

        int [] nums2 = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums2[(nums.length - k % nums.length + i) % nums.length];
        }

    }
}
