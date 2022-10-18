package SoloTest.Programmers;

import java.util.Arrays;

public class center {
    public static int solution(int[] array){
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{solution(new int[]{9,-1,0})}));
    }
}
