package uk.co.autotrader.alec.annotations;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

class AnnotationTest {


    @Test
    void name() throws InvocationTargetException, IllegalAccessException {
        SometimesImTrueAndSometimesImFalse fickle = new SometimesImTrueAndSometimesImFalse();
        StatementProcessor processor = new StatementProcessor();
        processor.execute(fickle);
    }
}
