package uk.co.autotrader.alec.annotations;

@Conditional
public class SometimesImTrueAndSometimesImFalse {

    @Evaluate
    private boolean evaluate(){
        return Math.random() < 0.5;
    }

    @IfTrue
    private void ifTrue() {
        System.out.println("True");
    }

    @IfFalse
    private void ifFalse(){
        System.out.println("False");
    }
}
