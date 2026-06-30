// Write a program to Generate Fibonacci series: 
import java.util.Scanner;

public class Ques13 {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of terms: ");
        int term = sc.nextInt();
        System.out.println("The Fibonacci series are: ");
        for (int i = 0; i < term; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        

        sc.close();
    }
}