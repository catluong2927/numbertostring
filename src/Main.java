import java.util.Scanner;

public class Main {
    public static String singleDigit(int num) {
        String digit = "";
        switch (num) {
            case 1:
                digit = "one";
                break;
            case 2:
                digit = "two";
                break;
            case 3:
                digit = "three";
                break;
            case 4:
                digit = "four";
                break;
            case 5:
                digit = "five";
                break;
            case 6:
                digit = "six";
                break;
            case 7:
                digit = "seven";
                break;
            case 8:
                digit = "eight";
                break;
            case 9:
                digit = "nine";
                break;
            case 10:
                digit = "ten";
                break;
            case 11:
                digit = "eleven";
                break;
            case 12:
                digit = "twelve";
                break;
            case 13:
                digit = "thirteen";
                break;
        }
        return digit;
    }

    public static String twoDigit(int num) {
        int last = num % 10;
        int first = num / 10;
        String twoNum = "";
        switch (first) {
            case 2:
                twoNum = (last == 0) ? "twenty" : ("twenty " + singleDigit(last));
                ;
                break;
            case 3:
                twoNum = "thirty " + singleDigit(last);
                break;
            case 5:
                twoNum = "fifty " + singleDigit(last);
                break;
            default:
                twoNum = singleDigit(first) + "ty " + singleDigit(last);
                break;
        }
        return twoNum;
    }

    public static String threeDigit(int num) {
        int first = num / 100;
        int remain = num % 100;
        String threeNum = "";
        threeNum = (remain == 0) ? (singleDigit(first) + " hundred") : (singleDigit(first) + " hundred " + twoDigit(remain));
        return threeNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 0) System.out.println("Zero");
        else {
            if (number > 0 && number <= 13) {
                System.out.println(singleDigit(number));
            } else if (number < 20) {
                int last = number % 10;
                System.out.println(singleDigit(last) + "teen");
            } else if (number < 100) {
                System.out.println(twoDigit(number));
            } else if (number < 1000) {
                System.out.println(threeDigit(number));
            }
        }

    }
}