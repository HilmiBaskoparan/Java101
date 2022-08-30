
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        
        // Fibonacci : 0 1 1 2 3 5 8 13 21 34
        int a = 0;
        int b = 1;
        int next;
        
        System.out.print(a + " " + b);
        
        for (int i = 2; i < number; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
    }
}
