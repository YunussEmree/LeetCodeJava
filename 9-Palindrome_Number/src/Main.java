public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }


    public static boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0) {
            return false;
        } else {
            int reverseNumber = 0;
            while (x > 0) {
                reverseNumber = reverseNumber * 10 + x % 10;
                x = x / 10;
            }
            return reverseNumber == temp;
        }
    }
}