/* Do-While Loop: used when we want to execute our statement atleast one time.
Syntax:
do{
    //code to be executed
    //update statement -> increment/decrement
}while(condition);
*/

public class Do_While_Loops {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
