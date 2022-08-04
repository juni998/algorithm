package algorithm.basic.string.words_in_sentence;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";
        int max = Integer.MIN_VALUE; //최소 값으로 초기화

        //split 방식
        String[] s = str.split(" "); //공백 기준으로 문자열 분리
        for (String x : s) {
            //최대 값 구하는 알고리즘
            int len = x.length();
            if (len > max) {
                max = len;
                result = x;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //한 줄 입력 받기

        System.out.println(main.solution(str));
    }
}
