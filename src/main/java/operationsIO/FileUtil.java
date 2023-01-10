package operationsIO;

import java.io.*;

public class FileUtil {

    public String readFile(String path) throws IOException {
        var fileReader = new FileReader(path);
        var bufferedReader = new BufferedReader(fileReader);
        var stringBuilder = new StringBuilder();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            stringBuilder.append(line);
        }
        return stringBuilder.toString();

    }

    public void writeFile (String path, String content) throws IOException {
        var fileWriter = new FileWriter(path);
        var bufferedWriter = new BufferedWriter(fileWriter);
        var stringBuilder = new StringBuilder();
        bufferedWriter.write(content);
        bufferedWriter.flush();

    }

}
