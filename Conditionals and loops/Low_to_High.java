import java.util.Scanner;
public class Low_to_High {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sum = 0;
        for(int i = low; i <= high; i++){
            sum += i;
        }
        System.out.println(sum);
        return;
    }

}
