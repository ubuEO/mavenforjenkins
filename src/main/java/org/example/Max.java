package org.example;

public class Max {
    public int maxOf3(int a, int b, int c) {
        if (a > b)
            if (a > c)
                return a;
            else
                return c;
        if (b > c)
            return b;
        else
            return c;
    }
    public void testMaxOf3(){
        System.out.println("should be 1 " + maxOf3(1,1,1));

        System.out.println("should be 2 " + maxOf3(1,1,2));
        System.out.println("should be 2 " + maxOf3(1,2,1));
        System.out.println("should be 2 " + maxOf3(2,1,1));

        System.out.println("should be 2 " + maxOf3(1,2,2));
        System.out.println("should be 2 " + maxOf3(2,1,2));
        System.out.println("should be 2 " + maxOf3(2,2,1));

        System.out.println("should be 3 " + maxOf3(1,2,3));
        System.out.println("should be 3 " + maxOf3(1,3,2));
        System.out.println("should be 3 " + maxOf3(2,1,3));
        System.out.println("should be 3 " + maxOf3(2,3,1));
        System.out.println("should be 3 " + maxOf3(3,1,2));
        System.out.println("should be 3 " + maxOf3(3,2,1));








    }

    public static void main(String[] args) {
        Max m = new Max();
        m.testMaxOf3();
    }
}
