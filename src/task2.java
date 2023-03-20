import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        double num1,num2,sum;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1= input.nextDouble();

        System.out.print("Enter the second number : ");
        num2= input.nextDouble();
        input.close();

        sum = num1 + num2;
        System.out.println("The sum of these two numbers = "+sum);

        //TASK COMPLETE - NO ISSUES
    }
}
