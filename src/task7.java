import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}

//NOTE : Continue with the solution to task6

//Write a program to print numbers up to X, where X is a integer value entered by the user.
//This time, Make sure only odd numbers are printed out.