//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    public static int solution(int[] nums1, int[] nums2){
        int result = 0;

        for (int num : nums1){
            result -= num;
        }
        for (int num : nums2){
            result += num;
        }

        result /= nums1.length;
        return result;

    }
}