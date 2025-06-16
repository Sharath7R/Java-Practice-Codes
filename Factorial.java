
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Give a number?");
        int num1 = Integer.valueOf(scanner.nextLine());
        for(int i = num1; i > 0; i--){
            if(i == 0){
                factorial *= 1;
            } else{
                factorial *= i;
            }
        }
        System.out.println("The sum is "+factorial);
    }
}
