import java.util.Scanner;

public class _11CompareTwoStrings_exercise_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String lineOne = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String lineTwo = in.nextLine();

        if (lineOne.length() > lineTwo.length())
            System.out.println(lineOne);
        else if (lineOne.length() < lineTwo.length())
            System.out.println(lineTwo);
        else
            System.out.println("Строчки равны");
    }
}
