package SoloTest.Programmers;

public class numberOfDigits {
    public static void main(String[] args) {
        int n = 987;

        int a = n%1000/100;
        int b = n%100/10;
        int c = n%10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);


        int hap = 0;
        while (n>0){
            hap += n%10;
            n/=10;
        }
        System.out.println(hap);
    }
}
