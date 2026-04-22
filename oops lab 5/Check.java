// User-defined Exception
class NotHexException extends Exception {
    NotHexException(String msg) {
        super(msg);
    }
}

public class Check {

    static void checks(String s) throws NotHexException {

        if (s.length() == 0)
            throw new NotHexException("Empty String");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!(Character.isDigit(ch) ||
                 (ch >= 'A' && ch <= 'F') ||
                 (ch >= 'a' && ch <= 'f'))) {

                throw new NotHexException("Not a Hexadecimal Number");
            }
        }

        System.out.println("Valid Hexadecimal Number");
    }

    public static void main(String[] args) {

        String num = "1A3G45";   

        try {
            checks(num);
        } catch (NotHexException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Ending the program");
    }
}