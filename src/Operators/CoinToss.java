package Operators;

import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        System.out.println(coin);
        if (coin % 2 == 0) {
            System.out.println("heads");
        }else {
            System.out.println("tails");
        }
    }
}
