import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiNumberCalculator {

    public static double addition(List<Double> numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    public static double subtraction(List<Double> numbers) {
        if (numbers.isEmpty()) return 0;
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    public static double multiplication(List<Double> numbers) {
        if (numbers.isEmpty()) return 0;
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    public static double division(List<Double> numbers) {
        if (numbers.isEmpty()) return 0;
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == 0) {
                System.out.println("Error! Division by zero.");
                return Double.NaN;
            }
            result /= numbers.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        while (true) {
            System.out.print("Enter choice (1/2/3/4): ");
            int choice = sc.nextInt();
            List<Double> numbers = new ArrayList<>();

            System.out.print("Enter number of values: ");
            int count = sc.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers.add(sc.nextDouble());
            }

            switch (choice) {
                case 1:
                    System.out.println("The answer is: " + addition(numbers));
                    break;
                case 2:
                    System.out.println("The answer is: " + subtraction(numbers));
                    break;
                case 3:
                    System.out.println("The answer is: " + multiplication(numbers));
                    break;
                case 4:
                    System.out.println("The answer is: " + division(numbers));
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3 or 4.");
            }
            break;
        }

        sc.close();
    }
}
