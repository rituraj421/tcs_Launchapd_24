package JAVA;

public class do_While_7 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } 
        while (i < 5);
        System.out.println();

        // break statements
        for(int j = 0; j<=5; j++){
            if(j == 4){
                break; // break the loop and come out of it 
            }
            System.out.print(j + " ");
        }
        System.out.println();
        // continue statements 
        for(int k = 0; k<=5; k++){
            if(k == 3){ 
                continue; // here it will skip the , '3' and move on to next part
            }
            System.out.print(k + " ");
        }
    }
}
