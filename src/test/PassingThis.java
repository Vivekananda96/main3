package test;

import java.util.Arrays;
import java.util.Random;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
// ... remove peel
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        int []a;
        a=new int[4];
        Random rand = new Random(100);
        System.out.println(rand.nextInt(20));
//        a = new int[rand.nextInt(20)];
//        Apple apple = new Apple();
//        new Person().eat(apple);
//        a[0]=1;
//        a[1]=2;
//        a[2]=12;
//        a[3]=1344;
//        System.out.println(a[1]);

    }
}