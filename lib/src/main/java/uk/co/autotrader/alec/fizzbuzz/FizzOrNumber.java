package uk.co.autotrader.alec.fizzbuzz;

import uk.co.autotrader.alec.annotations.Conditional;
import uk.co.autotrader.alec.annotations.Evaluate;
import uk.co.autotrader.alec.annotations.IfFalse;
import uk.co.autotrader.alec.annotations.IfTrue;

@Conditional
public class FizzOrNumber extends FizzBuzzOrNumber{

    public FizzOrNumber(int number) {
        super(number);
    }

    @Evaluate
    private boolean isFizz(){
        return number % 3 == 0;
    }

    @IfTrue
    private String ifTrue() {
        return "Fizz";
    }

    @IfFalse
    private String ifFalse(){
        return Integer.toString(number);
    }
}
