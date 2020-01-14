import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _19FinalTask_3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите текущий курс доллара: ");
            double dollar = in.nextDouble();
            System.out.print("Введите кол-во рублей, которые хотите перевести: ");
            int rub = in.nextInt();

            if (dollar ==0) {
                throw new ArithmeticException("Неверный курс ");
            }

            double convert = rub / dollar;
            System.out.printf("Сумма : %.2f долларов ", convert);
        } catch (InputMismatchException exc) {
            System.err.println("Введите корректное значение (Например 67,55): " + exc);
        } catch (ArithmeticException ex) {
            System.err.println("Деление на ноль, введите корректный курс: " + ex);
        }
    }
}
