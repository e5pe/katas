class RotateArray {
    /**
     * Given an array, it rotates to the right by k steps
     * 
     * @param nums array that is going to be rotated
     * @param k    steps to rotate the array
     */
    public void rotate(final int[] nums, int k) {
        // In case that k is bigger than nums.length we have to get the rest
        if (k > 0 && nums.length != k) {
            k = k % nums.length;
            // we make a copy of nums
            int[] aux = Arrays.copyOf(nums, nums.length);
            int indexToBeginning = nums.length - k;

            for (int i = 0; i < k; i++) {
                nums[i] = nums[i + indexToBeginning];
            }
            for (int i = 0; i < indexToBeginning; i++) {
                nums[i + k] = aux[i];
            }
        }
    }
}