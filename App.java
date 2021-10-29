import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Get 5 numbers from the user, and store them in an array, then find the sum, product, largest, and smallest of the numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int product = 1;
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
            product *= numbers[i];
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        scanner.close();

    }

    

}
