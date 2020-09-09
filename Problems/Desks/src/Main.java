import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        group1 = group1 % 2 == 0 ? group1 / 2 : (group1 + 1) / 2;
        group2 = group2 % 2 == 0 ? group2 / 2 : (group2 + 1) / 2;
        group3 = group3 % 2 == 0 ? group3 / 2 : (group3 + 1) / 2;

        System.out.print(group1 + group2 + group3);
    }
}