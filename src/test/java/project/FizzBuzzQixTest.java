package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }
    @Test
    public void threeAndSixReturnFizz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(3);
        String otherSpokenWord = underTest.interpret(6);
        assertThat(spokenWord).isEqualTo("Fizz");
        assertThat(otherSpokenWord).isEqualTo("Fizz");
    }
    @Test
    public void fiveAndTenReturnBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(5);
        String otherSpokenWord = underTest.interpret(10);
        assertThat(spokenWord).isEqualTo("Buzz");
        assertThat(otherSpokenWord).isEqualTo("Buzz");
    }
    @Test
    public void sevenAndFourteenReturnQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(7);
        String otherSpokenWord = underTest.interpret(14);
        assertThat(spokenWord).isEqualTo("Qix");
        assertThat(otherSpokenWord).isEqualTo("Qix");
    }
    @Test
    public void fifteenAndThirtyReturnFizzBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(15);
        String otherSpokenWord = underTest.interpret(30);
        assertThat(spokenWord).isEqualTo("FizzBuzz");
        assertThat(otherSpokenWord).isEqualTo("FizzBuzz");
    }
}
