package operationsIO;

import java.io.*;

public class FileUtil {

//    public String readFile(String path) {
//        var fileReader = new FileReader(path);
//        var bufferedReader = new BufferedReader(fileReader);
//        var stringBuilder = new StringBuilder();
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            stringBuilder.append(line);
//        }
//        return stringBuilder.toString();
//    }

    public String readFile(String path) {
        var stringBuilder = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

//    public void writeFile(String path, String content) throws IOException {
//        var fileWriter = new FileWriter(path);
//        var bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(content);
//        bufferedWriter.flush();
//    }

    public void writeFile(String path, String content) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(content);
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
