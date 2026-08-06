import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sum=0;
        int Count=0;
        while (Count<50){
            sum+=d;
            d+=10;
            Count++;
            
        }
        System.out.println(sum);
    }
} 
