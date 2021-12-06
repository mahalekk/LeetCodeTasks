
import java.util.Arrays;
import java.util.Locale;

public class BalanceStringSplit {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println("maximum amount of split balanced strings is " + balancedStringSplit(s));

    }
    public static int balancedStringSplit(String s) {
        char[] charFromString = s.toCharArray();
        int countOfStrings = 0;
        int index = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if('R'== charFromString[i]) {
                balance--;
                }
            else  if('L'== charFromString[i]) {
                balance++;
            }
            if (balance == 0) {
                countOfStrings++;
            }
            }
        return countOfStrings;
    }
}

