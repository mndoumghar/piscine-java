import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        FileOutputStream reader = new FileOutputStream(args[0]);
        byte[] buffer = new byte[1000];
        int x;
        while ((x = System.in.read(buffer)) != -1) {
            System.out.write(buffer,0,x);
        }
        reader.close();
    }
}
