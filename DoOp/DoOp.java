public class DoOp {

    public static String operate(String[] args) {
        if (args.length != 3) {return "Error";}
       

        int num1 = Atoi(args[0].trim());
        String operation = args[1];
        int num2 = Atoi(args[2].trim());

        switch (operation) {
            case "+":
                return Itoa(num1 + num2);

            case "-":
                return Itoa(num1 - num2);

            case "*":
                return Itoa(num1 * num2);

            case "/":
                if (num2 == 0) {
                   return "Error";
                }
                return Itoa(num1 / num2);

            case "%":
                if (num2 == 0) {
                     return "Error";
                }
                return Itoa(num1 % num2);

            default:
                return "Error";
        }
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

    public static String Itoa(int num) {
        if (num == 0) return "0";

        boolean negative = num < 0;
        if (negative) num = -num;

        StringBuilder res = new StringBuilder();

        while (num > 0) {
            char digit = (char) (num % 10 + '0');
            res.append(digit);
            num /= 10;
        }

        if (negative) {
            res.append('-');
        }

        return res.reverse().toString();
    }
}