import java.util.Scanner;

public class UnstructuredSumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int thirdNumber = scanner.nextInt();

        double sum = firstNumber + secondNumber + thirdNumber;

        double average = sum / 3;

        System.out.println("The sum of the numbers is : " + sum);
        System.out.println("The average of the numbers is : " + average);
    }
}
