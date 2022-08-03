package algorithm.basic.string.case_conversion;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

        //isLowerCase
        /*
        for (char x : str.toCharArray()) {
            //Character.isLowerCase : 소문자인지 확인하는 메소드
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
         */

        //ASCII
        for (char x : str.toCharArray()) {
            //대문자 : 65~90, 소문자 : 97~122
            if (x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32);
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
