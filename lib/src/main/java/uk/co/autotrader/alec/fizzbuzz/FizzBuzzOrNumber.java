package uk.co.autotrader.alec.fizzbuzz;

import uk.co.autotrader.alec.annotations.*;

@Conditional
public class FizzBuzzOrNumber {
    private final int number;

    public FizzBuzzOrNumber(int number) {
        this.number = number;
    }


    @Evaluate
    private boolean isFizzBuzz(){
        return number % 15 == 0;
    }

    @IfTrue
    private Object ifTrue(){
        return "FizzBuzz";
    }

    @IfFalse
    private Object ifFalse(){
        return new BuzzOrFizzOrNumber(number);
    }
}
