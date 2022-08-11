package algorithm.basic.string.문자거리;

import java.util.Scanner;

public class Main {
    public int[] solution(String str, char a) {
        int[] answer = new int [str.length()];
        int p = 1000;
        char[] x = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (x[i] == a) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            if (x[j] == a) {
                p = 0;
            } else {
                p++;
                if (answer[j] > p) {
                    answer[j] = p;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);

        for (int x : main.solution(str, a)) {
            System.out.print(x + " ");
        }
    }
}
