package uk.co.autotrader.alec.fizzbuzz;

import uk.co.autotrader.alec.annotations.*;

@Loop
public class FizzBuzzForARangeOfNumbers {

    private final int endNumber;
    protected int currentNumber;

    public FizzBuzzForARangeOfNumbers(int currentNumber) {
        this.currentNumber = currentNumber;
        this.endNumber = currentNumber;
    }

    public FizzBuzzForARangeOfNumbers(int currentNumber, int endNumber) {
        this.currentNumber = currentNumber;
        this.endNumber = endNumber;
    }

    @Evaluate
    private boolean executeLoop(){
        return endNumber - currentNumber >= 0;
    }

    @Execute
    private Object execute(){
        Object nextStatement = new FizzBuzzOrNumber(currentNumber);
        currentNumber++;
        return nextStatement;
    }
}
