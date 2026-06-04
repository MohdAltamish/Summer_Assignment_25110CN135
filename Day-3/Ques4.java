// Write a program to Find LCM of two numbers.

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int lcm = Math.max(A,B);
        while(true){
            if(lcm % A == 0 && lcm % B == 0 ){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}