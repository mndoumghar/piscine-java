import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) return;
        try (FileOutputStream out = new FileOutputStream(args[0])) {
            byte[] buf = new byte[4096];
            int n;
            while ((n = System.in.read(buf)) != -1) {
                out.write(buf, 0, n);
            }
        }
    }
}