import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fact = 1;

        while(num > 0){
            fact *= num;
            num--;
        }
        System.out.println("The factorial of the given number is: " + fact);
        sc.close();
    }
}