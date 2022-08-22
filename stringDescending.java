package SoloTest.Programmers;

import java.util.Arrays;

public class stringDescending {
    public static void main(String[] args) {
        String s = "ajvecgwasagag";

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr,0, arr.length));
        System.out.println(sb.reverse().toString());
    }
}
