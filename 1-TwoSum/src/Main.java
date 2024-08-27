import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; ; i++) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[]{m.get(y), i};
            }
            m.put(x, i);
        }
    }


}