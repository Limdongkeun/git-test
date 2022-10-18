package SoloTest.Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class NoEven {

    public static int[] solution(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}
