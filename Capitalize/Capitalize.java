import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) return;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder result = new StringBuilder();
                boolean boo = true;

                for (char c : line.toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        result.append(c);
                        boo = true;
                    } else {
                        if (boo && Character.isLetter(c)) {
                            result.append(Character.toUpperCase(c));
                            boo = false;
                        } else {
                            result.append(c);
                            boo = false;
                        }
                    }
                }

                writer.write(result.toString());
                writer.newLine();
            }
        }
    }
}