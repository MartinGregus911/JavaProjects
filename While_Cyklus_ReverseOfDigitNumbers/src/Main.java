
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj číslo na otočenie: ");
        int number = scanner.nextInt();

        number = Math.abs(number);
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reverzné číslo: " + reversed);
        scanner.close();
    }
}
