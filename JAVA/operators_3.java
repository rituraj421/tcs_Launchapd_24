package JAVA;
// working out with boolean data types

// *MOST IMPORTANT , LEARN ABOUT TERNARY OPERATORS*

public class operators_3 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean z = false;

        System.out.println(x && y);
        System.out.println(x && z);

        System.out.println(x || y);
        System.out.println(x || z);

        System.out.println(z ? "sahi" : "galat"); // for true , it perform first and for false it performs second

        // now we will deal with integer numbers

        int a = 10;
        int b = 15;
        int c = 10;

        System.out.println(a == c && b == 15);
        System.out.println(a == c && a == b);

        if (a == b && b == 15) {
            System.out.println("it's true");
        } 
        else {
            System.out.println("It's false");
        }

        // checkout some strings

        String d = "Hello"; // string literal
        String e = "hello";
        String f = new String("hello"); // string object
        System.out.println("Value of f is " + f);

        if(d == "Hello"){
            System.out.println("d is equal to Hello");
        }
        else{
            System.out.println("d is equal to e");
        }

        if(d == e){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }

        if(d.equals(e)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        if(e==f){
            System.out.println("They are equal");
        }
        else{
            System.out.println("Not quaal");
        }

        if(e.equals(f)){
            System.out.println(true);
        }

        // we must .equals methos for string cuz it checks for actual value , it does not check for reference 

        // .equals method is not for integers 


        // HOW DO WE IGNORE CASE SENSITIVITY
        if(d.equalsIgnoreCase(e)){
            System.out.println(true);
        }
    }
}
