package 유효한_팰린드롬;

import java.util.Locale;
import java.util.Scanner;

/*
1. 대문자 또는 소문자로 변환
2. 문자열에서 영어만 추출
3. 팰린드롬 체크
 */
public class Main {
    public String solution(String str) {
        String answer = "NO";
        //대문자 변환 후, 대문자가 아닌 것 제거
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        //문자열 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();

        //팰린드롬 체크
        if (str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
