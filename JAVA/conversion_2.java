package JAVA;

public class conversion_2 {
    public static void main(String[] args) {
        // this is caslled typecasting
        int xy = 10;
        double y = xy;
        System.out.println(xy);
        System.out.println(y);

        // we cannot conver from double to int
        // but we can convert from int to double

        // to do this we have to perform manual casting

        double z = 45.45;
        int a = (int) z;
        System.out.println(z);
        System.out.println(a);

        double b = 9/2; // we will get 4.0; cuz both are integet value
        System.out.println(b);

        double c = (double) 9/2; // or else do 9/2.0 or vive - versa
        System.out.println(c);
    }
}
