package test;
import java.io.*;
import java.util.*;
public class Rainbow {
    int a=5;

    int ChangeTheHueoftheColor(int b) {
     int  c = a + b;
     return c;
    }

    public static void main(String[] args) {
        Rainbow n = new Rainbow();

        System.out.println(n.ChangeTheHueoftheColor(5));
    }
}


