import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine().replace(" ", "");
        String str2 = scanner.nextLine().replace(" ", "");

        System.out.print(str1.equals(str2));
    }
}