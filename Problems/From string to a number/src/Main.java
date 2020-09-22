import java.util.Scanner;

class Main {

    public static void stringToNumber(String numberStr) {
        switch (numberStr) {
            case "one":
                System.out.print(1);
                break;
            case "two":
                System.out.print(2);
                break;
            case "three":
                System.out.print(3);
                break;
            case "four":
                System.out.print(4);
                break;
            case "five":
                System.out.print(5);
                break;
            case "six":
                System.out.print(6);
                break;
            case "seven":
                System.out.print(7);
                break;
            case "eight":
                System.out.print(8);
                break;
            case "nine":
                System.out.print(9);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.next();
        stringToNumber(numberStr);
    }
}