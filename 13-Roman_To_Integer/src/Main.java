import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
    public static int romanToInt(String s) {
        int val = 0;
        int prevVal = 0;

        for(int i = s.length()-1 ; i >= 0 ; i--) {
            char c = s.charAt(i);
            int currVal = switch(c) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if(currVal < prevVal) {
                val -= currVal;
            } else {
                val += currVal;
            }

            prevVal = currVal;
        }

        return val;
    }
}