package SoloTest.Programmers;

public class pizza {
    public static int solution(int slice, int n){
        int answer = 0;
        double m = (double) n/slice;
        System.out.println(m);
        if(slice>n){
            answer = 1;
        } else if (m == n/slice) {
            answer = (int) m;
        }else {
            answer = (int) m+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7,10));
    }
}
