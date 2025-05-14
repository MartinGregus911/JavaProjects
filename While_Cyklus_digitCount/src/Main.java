
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj číslo: ");
        int number = scanner.nextInt();

        number = Math.abs(number);
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Počet číslic: " + count);
        scanner.close();
    }
}
