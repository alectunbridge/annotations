package uk.co.autotrader.alec.annotations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.co.autotrader.alec.fizzbuzz.FizzBuzzForARangeOfNumbers;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzOrNumberTest {

    private StatementProcessor statementProcessor;

    @BeforeEach
    void setUp() {
        statementProcessor = new StatementProcessor();
    }

    @Test
    void test1() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(1);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("1");
    }

    @Test
    void test2() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(2);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("2");
    }

    @Test
    void test3() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(3);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Fizz");
    }

    @Test
    void test5() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(5);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Buzz");
    }

    @Test
    void test6() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(6);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Fizz");
    }

    @Test
    void test10() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(10);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Buzz");
    }

    @Test
    void test15() {
        FizzBuzzForARangeOfNumbers fizzBuzzOrNumber = new FizzBuzzForARangeOfNumbers(15);
        assertThat(statementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("FizzBuzz");
    }

    @Test
    void test30() {
        FizzBuzzForARangeOfNumbers fizzBuzzForARangeOfNumbers = new FizzBuzzForARangeOfNumbers(30);
        assertThat(statementProcessor.execute(fizzBuzzForARangeOfNumbers)).isEqualTo("FizzBuzz");
    }

    @Test
    void testRangeOfNumbers() {
        FizzBuzzForARangeOfNumbers fizzBuzzForARangeOfNumbers = new FizzBuzzForARangeOfNumbers(1,3);
        assertThat(statementProcessor.execute(fizzBuzzForARangeOfNumbers)).isEqualTo("1, 2, Fizz");
    }
}
