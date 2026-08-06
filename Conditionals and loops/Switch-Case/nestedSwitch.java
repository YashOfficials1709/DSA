
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();
        switch(empId){
            case 1:
                System.out.println("Rounak mani");
                break;
            case 2:
                System.out.println("Yash Raj");
                break;
            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department found");
                }
            default:
                System.out.println("Invalid employee id");
        }
    }
}