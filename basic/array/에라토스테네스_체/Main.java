package algorithm.basic.array.에라토스테네스_체;

import java.util.Scanner;

public class Main {
    public int solution(int num) {
        int answer = 0;
        int temp[] = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (temp[i] == 0) {
                answer++;
                for (int j = i; j <= num; j = j + i) temp[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(main.solution(num));
    }
}
