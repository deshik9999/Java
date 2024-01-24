public class ArraySumAverage {
    public static void main(String[] args) {
        // Declare an array with elements
        int[] array = {10, 20, 30, 40, 50};

        // Calculate sum and average
        int sum = 0;
        double average;

        for (int num : array) {
            sum += num;
        }

        average = (double) sum / array.length;

        // Display the sum and average
        System.out.println("Array elements: ");
        printArray(array);

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
