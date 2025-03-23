package Strings.NormalCodes;

public class Sum_Of_numbers_in_string {
    public static void main(String[] args) {
        String str = "hello1234567890";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Sum of digits: " + sum);

        int sumResult=str.chars().filter(c->Character.isDigit(c))
                .map(r->Character.getNumericValue(r)).sum();
        System.out.println("Sum of digits using streams: " + sumResult);

    }
}
