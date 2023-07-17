import java.util.Scanner;

//TASK COMPLETE - NO ISSUES

public class task4 {
    public static void main(String[] args){
        double fahrenheit,celcius;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature in celcius : ");
        celcius = input.nextDouble();

        fahrenheit=(celcius*9/5)+32;
        System.out.println("Temperature in fahrenheit is "+fahrenheit);


    }
}