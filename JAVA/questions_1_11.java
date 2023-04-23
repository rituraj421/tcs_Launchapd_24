package JAVA;

public class questions_1_11 {
    public static void main(String[] args) {
        
        int x = 1234568;
        int c = 0;
        while(x>0){
            x/= 10;
            c++;
        }
        System.out.println(c);

        // question 2;

        for(int i = 1; i<10; i++){
            for(int j = 1; j<10; j++){
                System.out.printf("%2d ", i*j);
            }
            System.out.println("");
        }
    }
    
}
