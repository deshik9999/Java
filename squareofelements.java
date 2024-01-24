public class ArraySquare {
    public static void main(String[] args) {
        // Declare and initialize a two-dimensional array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Display the original two-dimensional array
        System.out.println("Original Array:");
        printTwoDArray(twoDArray);

        // Display the square of the elements
        System.out.println("\nSquare of Elements:");
        printSquareArray(twoDArray);
    }

    public static void printTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSquareArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int square = arr[i][j] * arr[i][j];
                System.out.print(square + " ");
            }
            System.out.println();
        }
    }
}
