package algorithm.basic.string.회문문자열;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        char[] x = str.toCharArray();

        for (int i = 0; i < (str.length() / 2); i++) {
            if (x[i] != x[str.length() - i - 1]) answer = "NO";
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
