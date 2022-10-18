package SoloTest.Programmers;

import java.util.Arrays;

public class mode {
    public static int solution(int[] array){
        int answer = 0;
        int[] index = new int[array.length+1];
        int max = Integer.MIN_VALUE;

        for (int i = 0;i<array.length;i++){
            index[array[i]]++;
        }
        for (int i =0;i<index.length;i++){
            if(index[i] > max){
                max = index[i];
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{solution(new int[]{1,2,3,3,3,4})}));
    }
}
