package 숫자만_추출;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
