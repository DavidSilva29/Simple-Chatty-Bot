import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        System.out.print(0 < value && value < 10);
    }
}