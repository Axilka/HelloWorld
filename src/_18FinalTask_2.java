import java.util.Scanner;

public class _18FinalTask_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер одномерного массива: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите число в ячейку " + i + ": ");
            arr[i] = in.nextInt();
        }

        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }

        System.out.print("Сортировка по позрастанию вставками: ");
        for (int p : arr)
            System.out.print(p);
    }
}
