import java.io.*;
public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        FileInputStream reader = new FileInputStream(args[0]);
        byte[] buffer = new byte[1000];
        int x;
        while ((x = reader.read(buffer)) != -1) {
            System.out.write(buffer,0,x);
        }
        reader.close();
    }
}