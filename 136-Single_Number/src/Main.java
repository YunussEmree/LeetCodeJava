public class Main {

    public static void main(String[] args) {
        System.out.println(
            singleNumber(new int[]{2,2,1})
        );
    }

    public static int singleNumber(int[] nums) {
            int number = 0;
            for (int num : nums) {
                number = number ^ num;
            }
            return number;
    }

}