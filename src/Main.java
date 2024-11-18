import java.util.Scanner;

public class Main {
    public static int findLargestEvenIndex(int[] arr) {
        int maxEven = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > maxEven) {
                maxEven = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int index = findLargestEvenIndex(arr);
        if (index != -1) {
            System.out.println("Індекс найбільшого парного елемента: " + index);
        } else {
            System.out.println("Парних елементів немає.");
        }
        scanner.close();
    }
}