public class SortArgs {
    public static void sort(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            for (int j = 0; j < args.length - 1 ; j++) {
                if (Atoi(args[j]) > Atoi(args[j + 1])) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        
    for (int i = 0; i < args.length; i++) {
        if (i >0) { System.out.print(" ");}
        System.out.print(args[i]);
    }
        System.out.println();
    }

    public static int Atoi(String s) {
        int res = 0;
        int i = 0;
        boolean negative = false;

        // Handle sign
        if (s.charAt(0) == '-') {
            negative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit = c - '0';

            if (digit < 0 || digit > 9) {
                return 0;
            }

            res = res * 10 + digit;
        }

        return negative ? -res : res;
    }

}
