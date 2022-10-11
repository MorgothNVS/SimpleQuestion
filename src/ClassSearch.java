import java.util.HashSet;

public class ClassSearch {

    //простой поиск пары искомых чисел двойным циклом
    public int[] SearchWithDoubleFor(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k){
                    return new int[] { nums[i], nums[j] };
                }
            }
        }
        return new int[0];
    }

    //поиск через HashSet
    public int[] SearchWithHashSet(int[] nums, int k) {
        HashSet<Integer> Simple_set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (Simple_set.contains(numberToFind)){
                return new int[] { numberToFind, nums[i] };
            }
            else {
                Simple_set.add(nums[i]);
            }
        }
        return new int[0];
    }

    // Бинарный поиск (только для отсортированного массива)
    public int[] SearchWithBinary(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] == numberToFind) {
                    return new int[] { nums[i], nums[mid] };
                }
                if (numberToFind < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    // Поиск при помощи 2 указателей (только для отсортированного массива)
    public int[] SearchWithIndex(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k) {
                return new int[] { nums[l], nums[r] };
            }
            if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
