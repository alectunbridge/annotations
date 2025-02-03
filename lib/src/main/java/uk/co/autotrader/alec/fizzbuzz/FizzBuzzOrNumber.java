package uk.co.autotrader.alec.fizzbuzz;

import uk.co.autotrader.alec.annotations.*;

@Conditional
public class FizzBuzzOrNumber {

    protected int number;

    public FizzBuzzOrNumber(int number) {
        this.number = number;
    }

    @Evaluate
    private boolean isFizzBuzz(){
        return number % 15 == 0;
    }

    @IfTrue
    private String ifTrue(){
        return "FizzBuzz";
    }

    @IfFalse
    private String ifFalse(){
        return StatementProcessor.execute(new BuzzOrFizzOrNumber(number));
    }
}
