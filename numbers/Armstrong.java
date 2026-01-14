package numbers;
import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int digits = 0;

        int t = num;
        while (t != 0) {
            digits++;
            t = t / 10;
        }

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


