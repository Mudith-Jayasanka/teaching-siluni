import java.util.ArrayList;
import java.util.Collections;

//TASK COMPLETE - NO ISSUES

public class task9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        System.out.println(numbers);

       int largest= numbers.get(0);
       int smallest= numbers.get(0);

       for (int i =1;i< numbers.size();i++) {
           if (numbers.get(i) > largest) {
               largest = numbers.get(i);
           }
           if (numbers.get(i) < smallest) {
               smallest = numbers.get(i);
           }
       }

        System.out.println("Largest number is :" + largest );
        System.out.println("Smallest number is : " + smallest);



        //Continue Program
    }
}

//Write a program to print the largest and the smallest value in this ArrayList