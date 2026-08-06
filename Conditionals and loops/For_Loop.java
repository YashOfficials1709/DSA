/*
for loop- used when we know how many times loop will iterate.
for loop Syntax:
for (initialisation; condition; incremwnt/decrement){
    //body
}}
*/
import java.util.Scanner;
public class For_Loop {
    public static void main(String[] args) {
      /* 
        for (int i=1;i<=5;i+=1){
            System.out.println(i);
        }
        */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        
        }

    }
}
