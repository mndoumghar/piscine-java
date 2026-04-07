import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) return;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                String result = Arrays.stream(line.trim().split("\\s+"))
                        .map(word -> word.isEmpty() ? word :
                                Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                        .collect(Collectors.joining(" "));

                writer.write(result);
                writer.newLine();
            }
        }
    }
}