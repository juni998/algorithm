package algorithm.basic.array.점수계산;

import java.util.Scanner;

public class Main {
    public int solution(int n, int arr[]) {
        int answer = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}
