class RotateArray {
    /**
     * Given an array, it rotates to the right by k steps
     * 
     * @param nums array that is going to be rotated
     * @param k    steps to rotate the array
     */
    public void rotate(final int[] nums, int k) {
        if (k > 0) {
            int[] aux = new int[nums.length + k];
            for (int i = 0; i < nums.length; i++) {
                aux[i + 3] = nums[i];
            }
            for (int j = nums.length - 1; j >= 0; j--) {
                int pos = aux[j] != 0 ? j : j + nums.length;
                nums[j] = aux[pos];
            }
        }
    }
}