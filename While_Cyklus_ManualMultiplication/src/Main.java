import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj prvé celé číslo: ");
        int number1 = scanner.nextInt();

        System.out.print("Zadaj druhé celé číslo: ");
        int number2 = scanner.nextInt();

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        int result = 0;
        int counter = 0;

        while (counter < number2) {
            result += number1;
            counter++;
        }

        System.out.println("Výsledok násobenia: " + result);
        scanner.close();
    }
}

 