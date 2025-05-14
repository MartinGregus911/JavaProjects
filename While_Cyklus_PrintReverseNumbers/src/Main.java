  import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj číslo: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }

        scanner.close();
    }
}


