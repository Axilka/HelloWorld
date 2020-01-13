import java.io.*;

public class _14DataUpload_exercise_16 {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("E:/test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывод: " + exc);
        }
    }
}
