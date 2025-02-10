package dev.sumantakumar.pseudorandom;

import java.util.random.RandomGenerator;

public class PseudoRandomNumberExample {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGenerator.of("L128X1024MixRandom");

        System.out.println("Integer " + randomGenerator.nextInt());
        System.out.println("Integer " + randomGenerator.nextInt(50));
        System.out.println("Integer " + randomGenerator.nextInt(50, 100));
        System.out.println("=================");
        System.out.println("Long " + randomGenerator.nextLong());
        System.out.println("=================");
        System.out.println("Double " + randomGenerator.nextDouble());
        System.out.println("Double " + randomGenerator.nextDouble(5, 10));
        System.out.println("=================");

        System.out.println("Float " + randomGenerator.nextFloat());
        System.out.println("Boolean " + randomGenerator.nextBoolean());
        System.out.println("=================");
        //Stream of Random Number
        randomGenerator.ints(10).forEach(System.out::println);

    }
}
