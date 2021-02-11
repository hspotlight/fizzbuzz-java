package com.codurance.training.tasks;

public class FizzBuzz {
    public static final int FIZZ_CONSTANT = 3;
    public static final int BUZZ_CONSTANT = 5;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    int fizzNumber = FIZZ_CONSTANT;
    int buzzNumber = BUZZ_CONSTANT;

    public FizzBuzz() {

    }

    public FizzBuzz(int fizzNumber, int buzzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
    }

    public String convert(int number) {
        String answer = String.valueOf(number);

        if (isFizzBuzz(number)) {
            answer = FIZZ_BUZZ;
        } else if (isBuzz(number)) {
            answer = BUZZ;
        } else if (isFizz(number)) {
            answer = FIZZ;
        }
        return answer;
    }

    private boolean isFizz(int number) {
        return number % this.fizzNumber == 0;
    }

    private boolean isBuzz(int number) {
        return number % this.buzzNumber == 0;
    }

    private boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
