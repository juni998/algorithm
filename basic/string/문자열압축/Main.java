package algorithm.basic.string.문자열압축;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        str = str + " "; //공백을 추가한 이유 : 아래 for문에서 i == i+1로 비교하기 할때 마지막 문자의 비교 대상을 위하여 추가
        int cnt = 1; //반복되지 않더라도 문자 1개는 무조건 들어가기 때문에 1로 설정

        for (int i = 0; i < str.length()-1; i++) {
            //다음 문자가 같은 문자일 경우 cnt + 1
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                //반복 횟수가 1일 경우 생략하기
                if (cnt > 1) answer += String.valueOf(cnt);
                //다음 문자 체크를 위하여 초기화
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(main.solution(str));
    }
}
