package algorithm.basic.array.가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String solution(int num, int arrA[], int arrB[]) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            if (arrA[i] == arrB[i]) answer += "D";
            else if (arrA[i] == 1 && arrB[i]==3) answer += "A";
            else if (arrA[i] == 2 && arrB[i]==1) answer += "A";
            else if (arrA[i] == 3 && arrB[i]==2) answer += "A";
            else answer += "B";
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

        for (char x : main.solution(num, arrA, arrB).toCharArray()) System.out.println(x);

    }
}
