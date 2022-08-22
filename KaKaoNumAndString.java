package SoloTest.Programmers;

public class KaKaoNumAndString {
    public static int Solution(String s){
        int answer =0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0;i<10;i++){
            s = s.replace(num[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution("one4seveneight"));
    }
}
