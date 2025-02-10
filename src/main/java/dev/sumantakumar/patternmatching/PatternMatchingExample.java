package dev.sumantakumar.patternmatching;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = Integer.valueOf("1");

        if(obj instanceof Integer i ){
            int i1 = i * i;
            System.out.println(i1);
        }

    }

}
