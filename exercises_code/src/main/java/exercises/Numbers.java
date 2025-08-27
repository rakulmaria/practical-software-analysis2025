package exercises;

public class Numbers {

    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            result = result * 10 + digit;
        }

        return result;
    }
}
