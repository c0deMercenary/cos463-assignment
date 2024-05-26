import java.util.Scanner;

public class StructuredSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = getNumber(scanner, "Enter first number: ");
        double secondNumber = getNumber(scanner, "Enter second number: ");
        double thirdNumber = getNumber(scanner, "Enter third number: ");

        double sum = computeSum(firstNumber, secondNumber, thirdNumber);
        double average = computeAverage(sum, 3);

        System.out.println("The sum of the numbers " + sum);
        System.out.println("The average of the numbers " + average);
    }

    public static double getNumber(Scanner scanner, String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }

    public static double computeSum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double computeAverage(double sum, int noOfItems) {
        return (sum) / noOfItems;
    }
}
