package Functions;
import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        sum();
        
    }
    /*in java
    Function = a reusable block of code that performs a task.
    Method = a function that is associated with a class/object.
    Method Syntax:
    
    [access_modifier] [static] [return_type] [method_name](parameters) {
        // method body
    }
    
    Function syntax:
    [return_type] [function_name](parameters) {
        // function body
    }
    */

    //return is used when we want to return a value from the method
    //and after returning the value the method will terminate.
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }

    //void statement is used when we don't want to return any value from the method.
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
