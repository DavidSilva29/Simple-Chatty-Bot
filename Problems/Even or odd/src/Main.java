import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } while (num != 0);
    }
}