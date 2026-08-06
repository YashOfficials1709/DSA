import java.util.Scanner;
public class whatisit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("sweet red fruit");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("it is not a fruit");
                break;
        }
    }
}
    // .equals is used to compare the value of two strings.
    // == is used to compare the reference of two strings.
    // eg. a= 'apple' and b= 'apple' then a.equals(b) will return true but a==b will return false.

    //syntax for switch case:
    //switch(expression){
    //case value1:
    //  //code to be executed if expression == value1;
    //  break;
    //case value2:      
    //  //code to be executed if expression == value2;
    //  break;
    //default:
    //  //code to be executed if expression doesn't match any case;
    //  break;
    //}

    /*NOTE:
-cases have to be the same type as expressions, must be a constant or literal
-duplicate case values are not allowed
-break is use to terminate the sequence
-if break is not used, it will continue to next case
-default will execute when none of the above does
-if default is not at the end, put break after it
*/