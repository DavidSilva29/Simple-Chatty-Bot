import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 4;
        int element;
        while (scanner.hasNext()) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > n) {
                n = element;
            }
        }
        System.out.print(n);
    }
}