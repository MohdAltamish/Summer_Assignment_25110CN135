// Write a program to Print factors of a number. 

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        
        System.out.println("The given factors are: ");
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i + " ");
            }   
        }
        sc.close();
    }
}