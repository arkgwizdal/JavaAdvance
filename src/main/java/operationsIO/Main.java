package operationsIO;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        path();
//        buffer();
//        bufferedReader();
//        fileReader();
//        fileInputStream();

    }

    private static void path() throws IOException {
        Path path = Paths.get("src/main/resources/chanelFile");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Files.write(path,"Tomek".getBytes(), StandardOpenOption.WRITE);
    }
    private static void buffer() {
        CharBuffer charbuffer = CharBuffer.allocate(6);
        String name = "Tomek";

        for (int i =0; i<name.length(); i++){
            char c = name.charAt(i);
            charbuffer.put(c);
        }
//        System.out.println(charbuffer.array());
        System.out.println(Arrays.toString(charbuffer.array()));
    }
    private static void bufferedReader() throws IOException { //Przykład dekoratora, dekoratorem jest Buffereadreder dla Redera
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");
        var bufferedReader = new BufferedReader(fileReader);
        var bufferedWriter = new BufferedWriter(fileWriter);

        String line;
        while ( (line = bufferedReader.readLine()) != null ){
            System.out.println(line);
            bufferedWriter.write(line);  // z jakiegoś nieznanego powodu nie działa

        }







    }
    private static void fileReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var FileWriter = new FileWriter("src/main/resources/output");

       // System.out.println(fileReader.read());
        int i=fileReader.read();

        while ( i  != -1){
            System.out.println((char) i);
            i = fileReader.read();
        }


    }

    private static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input");
//        System.out.println(fileInputStream.available());
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/output");

//        System.out.println(fileInputStream.read());
//        int i = fileInputStream.read();
//        int i1 = fileInputStream.read();
//        int i2 = fileInputStream.read();
//        char c = (char) i;
//        char c1 = (char) i1;
//
//
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(i2);

        int i=fileInputStream.read();

        while ( i  != -1){

            fileOutputStream.write(i);
            System.out.println(i);
            i = fileInputStream.read();
        }

    }


}
