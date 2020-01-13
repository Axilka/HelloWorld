import java.util.Scanner;

public class _13SortDataInArray_exercise_15
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер одномерного массива: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0;i < size; i++)
        {
            System.out.print("Введите число в ячейку " + i + ": ");
            arr[i] = in.nextInt();
        }

        //int arr[] = {3, 7, 4, 4, 6, 5, 8};
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.print("Сортировка по позрастанию: ");
        for(int j : arr)
            System.out.print(j);
    }
}
