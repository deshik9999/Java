public class ArrayCopyExample {
    public static void main(String[] args) {
        // Declare an array with 8 elements
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // Declare another array to copy the elements
        int[] copiedArray = new int[8];

        // Copy the elements from the original array to the copied array
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Display the original array
        System.out.println("Original Array:");
        printArray(originalArray);

        // Display the copied array
        System.out.println("\nCopied Array:");
        printArray(copiedArray);
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
