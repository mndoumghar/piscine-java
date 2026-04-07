import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) return;

        String input = args[0];
        String output = args[1];

        try (
            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                String result = Arrays.stream(line.split("\\s+"))
                    .map(word -> word.isEmpty() ? word :
                        word.substring(0, 1).toUpperCase() + word.substring(1))
                    .collect(Collectors.joining(" "));

                writer.write(result);
                writer.newLine();
            }
        }
    }
}