import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int a = k / n;
        int b = k / m;

        if (a * n == k && a < m) {
            System.out.print("YES");
        } else if (b * m == k && b < n) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}