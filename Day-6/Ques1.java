// Write a program to Count set bits in a number. 

import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number; ");
        int bnum = sc.nextInt();
        int count = 0;
        while(bnum > 0){
            int rem = bnum % 2;
            if(rem == 1){
                count++;
            }
            bnum /= 10;
        }
        System.out.println("The give number has bits: " + count);
        sc.close();
    }
}