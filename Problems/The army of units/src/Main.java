import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();

        if (units < 1) {
            System.out.print("no army");
        } else if (units <= 19) {
            System.out.print("pack");
        } else if (units <= 249) {
            System.out.print("throng");
        } else if (units <= 999) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}