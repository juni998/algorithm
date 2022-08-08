package algorithm.basic.string.중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ", " + i + ", " + str.indexOf(str.charAt(i)));
            //중복 제거
            if (i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));
    }
}
