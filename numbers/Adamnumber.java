package numbers;

import java.util.Scanner;

public class Adamnumber {

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = n * n;
        int revNum = reverse(n);
        int squareRev = revNum * revNum;
        int revSquareRev = reverse(squareRev);

        if (square == revSquareRev)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

