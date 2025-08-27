
package exercises;

public final class FizzBuzz {
    private FizzBuzz() {}

    public static String fizzBuzz(int n) {
        String result = n + "!";
        if(n % 3==0) 
            if(n % 5==0) result= "FizzBuzz";
            else result="Fizz!";
        if (n % 5 == 0)  result= "Buzz!";
        return result;
    }
}
