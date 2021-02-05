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
    public void twoFourAndOneHundredThirtyFourReturnThemselves() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(2);
        String otherSpokenWord = underTest.interpret(4);
        String otherOtherSpokenWord = underTest.interpret(134);
        assertThat(spokenWord).isEqualTo("2");
        assertThat(otherSpokenWord).isEqualTo("4");
        assertThat(otherOtherSpokenWord).isEqualTo("134");
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
    @Test
    public void thirtyFiveAndSeventyReturnBuzzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(35);
        String otherSpokenWord = underTest.interpret(70);
        assertThat(spokenWord).isEqualTo("BuzzQix");
        assertThat(otherSpokenWord).isEqualTo("BuzzQix");
    }
    @Test
    public void twentyOneAndFourtyTwoReturnFizzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(21);
        String otherSpokenWord = underTest.interpret(42);
        assertThat(spokenWord).isEqualTo("FizzQix");
        assertThat(otherSpokenWord).isEqualTo("FizzQix");
    }
    @Test
    public void oneHundredFiveAndTwoHundredTenReturnFizzBuzzQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(105);
        String otherSpokenWord = underTest.interpret(210);
        assertThat(spokenWord).isEqualTo("FizzBuzzQix");
        assertThat(otherSpokenWord).isEqualTo("FizzBuzzQix");

    }
}
