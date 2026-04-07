import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File root = new File("documents");
        return find(root, fileName);
    }
    private static String find(File dir, String fileName) {
        if (dir == null || !dir.exists()) return null;
        File[] files = dir.listFiles();
        if (files == null) return null;

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return file.getPath();
            }
            if (file.isDirectory()) {
                String result = find(file, fileName);
                if (result != null) return result;
            }
        }
        return null;
    }
}