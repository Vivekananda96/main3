package test;

public class Storage {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Storage n = new Storage();
        System.out.print("lenght of string" + n.storage("hello"));
    }
}