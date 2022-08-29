package algorithm.basic.array.가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Character> solution(int num, int arrA[], int arrB[]) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (arrA[i] == arrB[i]) answer.add('D');
            else if (arrA[i] == 1) {
                if (arrB[i] == 2) answer.add('B');
                else answer.add('A');
            } else if (arrA[i] == 2) {
                if (arrB[i] == 1) answer.add('A');
                else answer.add('B');
            } else {
                if (arrB[i] == 1) answer.add('B');
                else answer.add('A');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arrA[] = new int[num];
        int arrB[] = new int[num];

        for (int i = 0; i < num; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            arrB[i] = sc.nextInt();
        }

        for (char x : main.solution(num, arrA, arrB)) {
            System.out.println(x);
        }
    }
}
