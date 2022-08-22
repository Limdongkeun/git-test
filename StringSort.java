package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSort {
    public static String[] Solution(String[] str, int n){
        String[] ans = {};

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i].charAt(n) + str[i]);
        }

        Collections.sort(list);

        ans = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i).substring(1,list.get(i).length());
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(new String[]{"sun", "bed", "car"}, 1)));
    }
}
