import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < a) {
            System.out.print("Deficiency");
        } else if (c > b) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
    }
}