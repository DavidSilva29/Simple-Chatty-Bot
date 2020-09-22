import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operation = scanner.next();
        long num2 = scanner.nextLong();

        switch (operation) {
            case "+":
                System.out.print(num1 + num2);
                break;
            case "-":
                System.out.print(num1 - num2);
                break;
            case "*":
                System.out.print(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.print("Division by 0!");
                } else {
                    System.out.print(num1 / num2);
                }
                break;
            default:
                System.out.print("Unknown operator");
                break;
        }
    }
}