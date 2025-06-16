
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Write your program here
            System.out.println("Give the first number:");
            int first = Integer.valueOf(scanner.nextLine());
            System.out.println("Give the second number:");
            int second = Integer.valueOf(scanner.nextLine());
            int add = first +second;
            int diff =first - second;
            int mul = first * second;
            double div = (double)first/second;
            System.out.println(first+" + "+second + " = "+ add);
            System.out.println(first+" - "+second + " = "+ diff);
            System.out.println(first+" * "+second + " = "+ mul);
            System.out.println(first+" / "+second + " = "+ div);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
