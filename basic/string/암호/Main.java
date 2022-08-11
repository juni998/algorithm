package algorithm.basic.string.암호;

import java.util.Scanner;

public class Main {
    public String solution(int num, String str) {
        String answer = "";

        //문자의 개수만큼 분리
        for (int i = 0; i < num; i++) {
            //7개씩 분리 하면서 # = 1, * = 0으로 변환
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            //2진수로 변환
            int n = Integer.parseInt(tmp, 2);
            //문자로 나오도록 char 타입으로 변환
            answer += (char) n;
            //이미 분리된 문자열을 제외하고 저장
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(num, str));
    }
}
