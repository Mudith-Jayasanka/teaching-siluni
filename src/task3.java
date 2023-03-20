import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        if (age>=18){
            System.out.println("Go get high baby!");
        } else if (age<18) {
            System.out.println("Too small to do shit you lil kid");

        }
        System.out.println("end");

        //TASK COMPLETE - NO ISSUES
    }
}
