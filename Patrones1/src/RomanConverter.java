public class RomanConverter {

    public static String convertToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Entre 1 y 3999");
        }

        String[] romanSymbols = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int[] decimalValues = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        StringBuilder romanNumeral = new StringBuilder();

        int i = decimalValues.length - 1;

        while (number > 0) {
            if (number - decimalValues[i] >= 0) {
                romanNumeral.append(romanSymbols[i]);
                number -= decimalValues[i];
            } else {
                i--;
            }
        }

        return romanNumeral.toString();
    }
}
