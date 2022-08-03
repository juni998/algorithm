package algorithm.basic.string.find_char;
import java.util.Scanner;



class Main {
    public int solution(String str, char t) {
        int sum = 0;

        //대소문자 구별X
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //문자열 순회 for
        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) sum++;
        }
        */

        //문자열 순회 forEach
        for (char x : str.toCharArray()) { //toCharArray : 문자열 문자 하나하나를 분리 시켜서 문자 배열 생성
            if (x == t) {
                sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0); // charAt(0) : 문자열 0번 인덱스에 접근

        System.out.println(main.solution(str, t));
    }
}
