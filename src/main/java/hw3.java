public class hw3 {
    import java.util.Arrays;
        private static double[][] m;

        public static void main(String[] args) {
            System.out.println("1:");
            changeArray();
            System.out.println("\n\n2:");
            createArray();
            System.out.println("\n\n3:");
            changeArray2();
            System.out.println("\n\n4:");
            fillDiagonal(5);
            System.out.println("\n\n8:");
            swap();
        }


        private static void changeArray() {
            int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.print("До: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                if (arr[i] == 0) arr[i] = 1;
                else arr[i] = 0;
            }
            System.out.print("\nПосле: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        static void createArray() {
            int[] arr = new int[100];
            for (int i = 0, j = 0; i < arr.length; i++, j += 1) {
                arr[i] = j;
                System.out.print(arr[i] + " ");
            }
        }

        private static void changeArray2() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            System.out.print("До: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.print("\nПосле:  ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
        }

        static void fillDiagonal(int size) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                matrix[i][i] = 5;
                matrix[i][size - i - 1] = 1;
            }
            System.out.println(Arrays.deepToString(matrix));
            for (int i = 0; i < size; i++)
                System.out.println(Arrays.toString(matrix[i]));
        }
        static void swap() {
            int[] array, int n;
            int len = array.length;
            n = )len+ n % len) % len;
            for (int i = 0; i < n; I++) {
                int first = array[0];
                for (int i = 0; i < len - 1; i++) {
                    array[len-1] = first;
                }

            }
        }
}



