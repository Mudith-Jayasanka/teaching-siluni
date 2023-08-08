import java.util.Scanner;

//TASK COMPLETE - NO ISSUES

public class task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi Baby!");
        System.out.print("Please enter your msg : ");
        String msg = input.next();

        while (!msg.equals("hi")){
            System.out.println("Hi Baby!");
            msg = input.next();
        }

        //Find out why you cant compare strings with != Operator in Java

        input.close();


        }
    }



//When you run the program, it will greet you with the message "Hi Mudith" (or any other custom greeting you prefer).
//You will then have the option to enter a message of your choice.
//After you enter your message, the program will reply with "Hi Mudith" again.
//The program will keep responding with "Hi Mudith" unless you type "hi" (without quotes) as your response.
//If you type anything other than "hi," the program will continue saying "Hi Mudith."
//The program will end when you type "hi" as your response.