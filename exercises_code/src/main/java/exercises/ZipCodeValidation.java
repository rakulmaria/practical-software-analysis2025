package exercises;

public final class ZipCodeValidation {
    private ZipCodeValidation() {}

    public static boolean isValid(int digits, String letters) {
        if (letters == null || letters.length() != 2) return false;

        if (digits < 1000 || digits >= 4000) return false;

        char a = letters.charAt(0);
        char b = letters.charAt(1);

        if (!Character.isUpperCase(a) || !Character.isUpperCase(b)) return false;
        if (a > 'C' && a < 'M') return false;
        else if (b < 'C' || b > 'M') return false;

        return true;
    }
}
