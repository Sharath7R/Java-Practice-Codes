
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg;
        int odd = 0;
        int even = 0;
        while(true){
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            } else if(num %2 == 0){
                even += 1;
            }  else if(num %2 != 0){
                odd += 1;
            }
            sum += num;
            count += 1;
            
        }
        avg = (double)sum/count;
        System.out.println("Sum is: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
