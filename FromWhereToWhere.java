
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int num1 = Integer.valueOf(scanner.nextLine());
        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }
}
