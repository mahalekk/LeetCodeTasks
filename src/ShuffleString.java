import java.lang.reflect.Array;
import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
    int[] index = {4,5,6,7,0,2,1,3};
    System.out.println(restoreString("codeleet", index));
    }

    public static String restoreString(String s, int[] index) {

       char[] charS = s.toCharArray();
        char[] restoreCharString = new char[index.length];

        String restoreString = "";
        for (int i = 0; i < index.length; i++) {
            restoreCharString [index[i]] = charS[i];
        }
        restoreString = new String(restoreCharString);
        return restoreString;

    }
}

