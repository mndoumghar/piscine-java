import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int line;
        while ((line = reader.read()) != -1) {
            System.out.print((char)line);
        }
        reader.close();
    }
}