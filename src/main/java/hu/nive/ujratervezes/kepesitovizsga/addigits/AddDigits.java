package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {


    public int addDigits(String input) {
        int summ = 0;
        if ((input == null) || (input.isBlank())) {
            return -1;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    summ += Integer.parseInt(String.valueOf(input.charAt(i)));
                }
            }
            return summ;
        }
    }
}
