package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    public static void createFile(List<String> data) throws IOException {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("AssertFile.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (String line:data) {
                bfwriter.write(line);
            }
            bfwriter.close();
        }
         finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
