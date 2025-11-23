package Assignment;
import java.util.Scanner;
public class Question4 {
    public static int count(int[] arr, int x) {
        int count = 0;
        for (int number : arr) {
            if (number == x) {
                count++;
            }
        }
        return count;
    }
    public static int partition(int[] arr) {
        int x = arr[0];
        int[] temp = new int[arr.length];
        int idx = 0;

        // smaller values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < x) {
                temp[idx] = arr[i];
                idx++;
            }
        }

        int Index = idx;
        temp[idx] = x;
        idx++;

        // greater values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > x) {
                temp[idx++] = arr[i];
            }
        }

        // copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return Index;
    }
    public static void duplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        visited[j] = true;
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " time(s).");
            }
        }
    }
    public static void circular(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int next1 = arr[(i + 1) % arr.length];
            int next2 = arr[(i + 2) % arr.length];
            temp[i] = next1 + next2;
        }

        // copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    public static void shiftCircular(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(i + 2) % arr.length];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Count occurrences");
            System.out.println("2. Partition array");
            System.out.println("3. Show duplicates");
            System.out.println("4. Circular sum");
            System.out.println("5. Shift circular left by 2");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number to count: ");
                    int x = sc.nextInt();
                    System.out.println("Occurrences = " + count(arr, x));
                    break;

                case 2:
                    int pos = partition(arr);
                    System.out.println("Pivot placed at index: " + pos);
                    break;

                case 3:
                    duplicates(arr);
                    break;

                case 4:
                    circular(arr);
                    System.out.println("Circular sum applied.");
                    break;

                case 5:
                    shiftCircular(arr);
                    System.out.println("Array shifted circularly.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            // print array after each operation
            System.out.print("Array: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}
