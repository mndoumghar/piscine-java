
public class CleanExtract {

    public static String extract(String s) {
        String[] parts = s.split("\\|");
        String result = "";

        for (String word : parts) {

            String  res = word.trim();
            if (res.startsWith(".") && res.endsWith(".")) {
                System.out.println();
                result += res.substring(1, res.length() -1)+ " ";
            } else if (res.contains(".")) {
                int findpoint = res.indexOf(".");
                if (findpoint>= 0) {
                    if (res.indexOf(".")+1  == res.lastIndexOf(".")) {
                        continue;
                    }
                    result += res.substring(findpoint+1, res.length())+ " " ;
                } 

            }else {
                    result+= res ;               
                 }

        }

     
       return result.trim();
    }
}