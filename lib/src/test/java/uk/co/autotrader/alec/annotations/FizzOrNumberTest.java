package uk.co.autotrader.alec.annotations;

import org.junit.jupiter.api.Test;
import uk.co.autotrader.alec.fizzbuzz.FizzBuzzOrNumber;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzOrNumberTest {

    @Test
    void test1() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(1);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("1");
    }

    @Test
    void test2() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(2);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("2");
    }

    @Test
    void test3() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(3);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Fizz");
    }

    @Test
    void test5() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(5);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Buzz");
    }

    @Test
    void test6() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(6);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Fizz");
    }

    @Test
    void test10() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(10);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("Buzz");
    }

    @Test
    void test15() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(15);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("FizzBuzz");
    }

    @Test
    void test30() {
        FizzBuzzOrNumber fizzBuzzOrNumber = new FizzBuzzOrNumber(30);
        assertThat(StatementProcessor.execute(fizzBuzzOrNumber)).isEqualTo("FizzBuzz");
    }


}
