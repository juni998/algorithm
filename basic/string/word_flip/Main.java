package algorithm.basic.string.word_flip;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        //StringBuilder의 reverse를 활용한 뒤집기
        /*
        for (String x : str) {
            //StringBuilder 란?
            //reverse : 문자열 뒤집기
            //toString : String 으로 변환
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
         */

        //직접 뒤집기
        for (String x : str) {
            //String을 char 배열로 변환
            char[] s = x.toCharArray();
            int lt = 0; //첫 번째 인덱스 위치
            int rt = x.length() - 1; //마지막 인덱스 위치

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        //n개의 문자열 입력
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        //출력
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
