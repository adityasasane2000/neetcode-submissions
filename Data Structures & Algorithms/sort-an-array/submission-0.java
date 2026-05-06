class Solution {
    public void conqure(int[] nums, int st, int mid, int end) {
        int[] arr = new int[end - st + 1];

        int i = st;
        int j = mid + 1;
        int idx = 0;

        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                arr[idx] = nums[i];
                i++;
            } else {
                arr[idx] = nums[j];
                j++;
            }
            idx++;
        }

        while (i <= mid) {
            arr[idx++] = nums[i++];
        }

        while (j <= end) {
            arr[idx++] = nums[j++];
        }

        int temp = st;

        for (int k = 0; k < arr.length; k++) {
            nums[temp] = arr[k];
            temp++;
        }
    }

    public void mergeSort(int[] nums, int st, int end) {
        if (st == end)
            return;

        int mid = st + (end - st) / 2;

        mergeSort(nums, st, mid);
        mergeSort(nums, mid + 1, end);

        conqure(nums, st, mid, end);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}

// st = 0
// end = 1

// mid = 0