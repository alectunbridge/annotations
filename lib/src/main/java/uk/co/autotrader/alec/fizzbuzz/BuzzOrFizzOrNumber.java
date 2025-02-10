package uk.co.autotrader.alec.fizzbuzz;

import uk.co.autotrader.alec.annotations.*;

@Conditional
public class BuzzOrFizzOrNumber extends FizzOrNumber {

    public BuzzOrFizzOrNumber(int number) {
        super(number);
    }

    @Evaluate
    private boolean isBuzz(){
        return currentNumber % 5 == 0;
    }

    @IfTrue
    private String ifTrue() {
        return "Buzz";
    }

    @IfFalse
    private Object ifFalse(){
        return new FizzOrNumber(currentNumber);
    }
}
