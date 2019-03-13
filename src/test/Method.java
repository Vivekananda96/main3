package test;

public class Method {
    static int a;
   static int b;
   static int c;

   static void add()

    {
        c = a + b;
    }

    public static void main(String[] args)

    {
        add();
        System.out.println("the value of c" + c);
    }
}
