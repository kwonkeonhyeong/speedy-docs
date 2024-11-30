package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    // 경로에 있는 파일을 줄 별로 읽음.
    public static List<String> readFromFile(String filePath) {
        List<String> data = new ArrayList<>();
        try (
                BufferedReader reader = new BufferedReader(new FileReader(filePath))
        ) {
            addToken(data, reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static void addToken(List<String> data, BufferedReader reader) throws IOException {
        String token;
        while ((token = reader.readLine()) != null) {
            if (!token.isBlank()) {
                data.add(token);
            }
        }
    }

    // 파일에 데이터 쓰기
    // 이어 써야 하는 경우 new FileWriter(filePath, true) 사용
    public static void uploadDataToFile(List<String> data, String filePath) {
        try (
                PrintWriter writer = new PrintWriter(new FileWriter(filePath))
                ) {
            for (String line : data) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
