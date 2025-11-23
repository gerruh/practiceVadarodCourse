package practice.lessons.task8;
import java.io.*;
import java.nio.file.Paths;

/*
1. Записать его в файл прописал относительный путь.
2. Записать его в файл прописав абсолютный путь.
3. Вычитать текст из первого файла.
4. Вычитать текст из второго файла
 */

public class Task1WithBRBW {
    public static void main(String[] args) {
        String text = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.";

        String relativePath = "text_relative.txt";
        writeToFileBuffered(relativePath, text);
        System.out.println("1. Текст записан в файл с относительным путем: " + relativePath);

        String absolutePath = Paths.get("").toAbsolutePath().toString() + "/text_absolute.txt";
        writeToFileBuffered(absolutePath, text);
        System.out.println("2. Текст записан в файл с абсолютным путем: " + absolutePath);

        String content1 = readFromFileBuffered(relativePath);
        System.out.println("3. Текст из первого файла (относительный путь):");
        System.out.println(content1);

        String content2 = readFromFileBuffered(absolutePath);
        System.out.println("4. Текст из второго файла (абсолютный путь):");
        System.out.println(content2);
    }

    private static void writeToFileBuffered(String filePath, String text) {
        try (Writer writer = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static String readFromFileBuffered(String filePath) {
        StringBuilder content = new StringBuilder();
        try (Reader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return content.toString();
    }
}