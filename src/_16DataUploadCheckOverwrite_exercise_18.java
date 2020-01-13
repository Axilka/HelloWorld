import java.io.*;

public class _16DataUploadCheckOverwrite_exercise_18 {
    public static void main(String[] args) {

        int i = 0, j = 0;
        String line;

        try {
            File file = new File("E:/test.txt"); //создаём объект текстового файла
            FileReader fileReader = new FileReader(file); //поток, который подключается к текстовому файлу
            BufferedReader bufferedReader1 = new BufferedReader(fileReader); //соединяем FileReader с BufferedReader для считывания текста из потока

            while((line = bufferedReader1.readLine()) != null) {
                System.out.println(line); //выводим содержимое файла на экран построчно
                i++;
            }
            System.out.println("Кол-во строк в файле = " + i);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывод: " + exc);
        }

        try (FileWriter fw = new FileWriter("E:/test.txt"))
        {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedWriter2 = new BufferedReader (inputStreamReader);

            do {
                System.out.print(": ");
                line = bufferedWriter2.readLine();
                j++;

                line = line + "\r\n"; //возврат каретки и перенос строки
                fw.write(line);

                if (j == i) break;
            } while (j != i);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывод: " + exc);
        }
    }
}
