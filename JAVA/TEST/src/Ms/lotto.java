package Ms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 게임?");
        int count = sc.nextInt();   
        sc.close();
        int lottogame = 1;

        ArrayList lotto = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            lotto = new ArrayList();
            for (int j = 0; j < 6; j++) {
                int rand = random.nextInt(45) + 1;
                if (lotto.contains(rand)) {
                    j--;
                } else {
                    lotto.add(rand);
                }
                
                
            }

            Collections.sort(lotto);

            System.out.print("[" + lottogame + " 게임] ");
            for (int k = 0; k < lotto.size(); k++) {
                System.out.print((lotto.get(k))+" ");
            }

            lottogame++;
            System.out.println();
        }

        
    }
}

