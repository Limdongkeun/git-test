package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectHap {
    public static int[] Solution(int[] numbers){
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< numbers.length-1;i++){
            for(int j=i+1;j< numbers.length;j++){
                int a = numbers[i]+numbers[j];
                if (!list.contains(a)){
                    list.add(a);
                }
            }
        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(new int[]{2,1,3,4,1})));
    }
}
