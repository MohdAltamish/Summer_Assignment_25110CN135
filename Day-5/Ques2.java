// Write a program to Check Strong number
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int org = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        } 
    
        if(sum == org){
            System.out.println("The number is a strong number:");
        }
        else{
            System.out.println("The number is not a strong number:");
        }

        sc.close();
    }
}


