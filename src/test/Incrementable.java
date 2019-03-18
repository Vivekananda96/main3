package test;


class Incrementable {

    static int i;

    static void increment() {
        i = i + 1;
    }

    public static void main(String[] args) {
        increment();
        System.out.println("value of i is" + i);
    }
}
