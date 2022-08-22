package SoloTest.Programmers;

import java.util.Arrays;

public class doubleArrHap {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        int[][] answer = new int[arr1.length][arr1[0].length];

//
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));
        System.out.println(arr1[0][0] + arr2[0][0]);
        System.out.println(arr1[0].length);
    }
}
