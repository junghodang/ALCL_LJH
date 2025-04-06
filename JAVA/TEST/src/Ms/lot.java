package Ms;

import java.util.Random;
import java.util.Scanner;

public class lot {
    public static void main(String[] args) {

        // 배열 -> ArrayList
        // 게임수1~5 입력받고 

        Scanner sc = new Scanner(System.in);
        
        
        Random random = new Random();
        int[] lotto = new int[6];

        for(int i = 0; i < 6; i++) {
            int number = random.nextInt(45);
            for (int j = 0; j < i; j++) {
                if (lotto[j] == number) {
                    number = random.nextInt(45);
                    j = -1;
                }
            }
            lotto[i] = number;
        }

        System.out.println("로또번호");

        for(int number : lotto) {
            System.out.print("[" + number + "]");
        }

    }
}
