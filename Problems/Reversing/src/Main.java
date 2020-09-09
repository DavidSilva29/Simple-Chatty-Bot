import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int value1 = number / 100;
        int value2 = ((number % 100) / 10) * 10;
        int value3 = (number % 10) * 100;

        System.out.print(value3 + value2 +  value1);
    }
}